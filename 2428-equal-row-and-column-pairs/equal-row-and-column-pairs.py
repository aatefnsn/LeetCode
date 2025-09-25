class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        d={}
        L=[]
        count=0
        for i in range (len(grid)): #columns
            s=""
            for j in range (len(grid[0])): #rows
                s = s +','+ str(grid[i][j])
            d[i]=s
            '''
            if s in L:
                print("string " ,s, " is present incrementing counter")
                count+=1
            else:
                print("string " ,s, " is not present adding it to list")
                L.append(s)
            '''
            #print(s)
        print(d)
        print("done with rows")
        for i in range (len(grid[0])): #columns
            s=""
            for j in range (len(grid)): #rows
                s = s +','+ str(grid[j][i])
            for key,value in d.items():
                if s == value:
                    count+=1
            '''
            if s in L:
                print("string " ,s, " is present incrementing counter")
                count+=1
            else:
                print("string " ,s, " is not present adding it to list")
                L.append(s)
            '''
            #print(s)

        return count
                

        