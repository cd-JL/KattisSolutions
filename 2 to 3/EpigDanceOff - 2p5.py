def masterfunction():
    lists = []
    test = 0
    count = 1
    n, m = map(int,input().split())

    for i in range(0, n):
        lists.append(input())
        

    for b in range(0,m):
        test = 0
        for i in range(0,n):
            if lists[i][b] == "_":
                test += 1
            else:
                break

        if test == n: 
            count += 1

    print(count)

masterfunction()
