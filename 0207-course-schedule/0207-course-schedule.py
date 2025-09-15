class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        
        PreMap=defaultdict(list)
        courseDepCount= [0] * numCourses

        for course, prereq in prerequisites:
            PreMap[prereq].append(course)
            courseDepCount[course]+=1
        
        queue=deque()

        for i in range(numCourses):
            if courseDepCount[i] == 0:
                queue.append(i)
        
        completed=0

        while queue:
            prereq=queue.popleft()
            completed+=1
            for nextCourse in PreMap[prereq] :
                courseDepCount[nextCourse]-=1
                if courseDepCount[nextCourse] == 0:
                    queue.append(nextCourse)

        return completed == numCourses

        
        """
        #def canFinish(numCourses, prerequisites):
        # Build adjacency list and calculate in-degrees
        graph = defaultdict(list)
        in_degree = [0] * numCourses
        
        for course, prereq in prerequisites:
            graph[prereq].append(course)
            in_degree[course] += 1
        
        # Start with courses that have no prerequisites
        queue = deque([i for i in range(numCourses) if in_degree[i] == 0])
        completed = 0
        
        # Process courses level by level
        while queue:
            course = queue.popleft()
            completed += 1
            
            # Remove this course and update dependent courses
            for next_course in graph[course]:
                in_degree[next_course] -= 1
                if in_degree[next_course] == 0:
                    queue.append(next_course)
        
        # If we completed all courses, no cycle exists
        return completed == numCourses
        """