class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda i : i[0])
        print(intervals)
        output=[intervals[0]]
        for start, end in intervals[1:]:
            lastEnd=output[-1][1]
            if lastEnd>=start:
                output[-1][1]=max(lastEnd,end)
            else:
                output.append([start,end])
        return output
        '''
        intervals.sort(key=lambda i :  i[0] )
        print(intervals)
        output=[intervals[0]]

        for start, stop in intervals[1:]:
            lastEnd = output[-1][1]
            if lastEnd >= start:
                output[-1][1]=max(stop,lastEnd)
            else:
                output.append([start,stop])
        return output
        '''

        