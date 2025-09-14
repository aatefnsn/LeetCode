class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
        preMap=defaultdict(list)
        tracker = numCourses * [0]

        for course, prereq in prerequisites:
            preMap[prereq].append(course)
            tracker[course]+=1
        queue=deque()
        for i in range(numCourses):
            if tracker[i] == 0:
                queue.append(i)
        completed =0
        while queue:
            prereq = queue.popleft()
            completed+=1

            for next_course in preMap[prereq]:
                tracker[next_course]-=1
                if tracker[next_course] == 0:
                    queue.append(next_course)

        return completed == numCourses
        
        """
        # Create empty graph where each key points to list of dependent courses
        graph = defaultdict(list)
        # Track how many prerequisites each course has (0 to numCourses-1)
        in_degree = [0] * numCourses
        
        # Build the graph from prerequisites list
        for course, prereq in prerequisites:
            # Add edge: prerequisite -> course (prereq must come before course)
            graph[prereq].append(course)
            # Increment in-degree: course has one more prerequisite
            in_degree[course] += 1
        
        # Create empty queue to store courses we can take
        queue = deque()
        
        # Find all courses with no prerequisites and add them to queue
        for i in range(numCourses):
            if in_degree[i] == 0:
                queue.append(i)
        
        # Counter to track how many courses we've successfully completed
        completed = 0
        
        # Process courses level by level using BFS
        while queue:
            # Take a course with no remaining prerequisites
            course = queue.popleft()
            # Mark this course as completed
            completed += 1
            
            # Look at all courses that depend on this completed course
            for next_course in graph[course]:
                # Reduce prerequisite count since we completed the prerequisite
                in_degree[next_course] -= 1
                # If this course now has no prerequisites, it can be taken
                if in_degree[next_course] == 0:
                    queue.append(next_course)
        
        # If we completed all courses, there's no cycle (valid schedule exists)
        # If completed < numCourses, there's a cycle (some courses are stuck)
        return completed == numCourses
        """
        