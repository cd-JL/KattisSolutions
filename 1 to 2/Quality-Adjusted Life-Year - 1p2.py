def master_function():
    y = 0
    summ = 0
    x = int(input())
    while not x >= 1 and x <= 100:
        x = int(input())

    for i in range(x):
        y = periods_of_life(x)
        summ += y
    print("%.3f" % summ)

def periods_of_life(periods):
    x1 = 0
    x2 = 0
    done = False
    while done == False:
        temp = input()
        temp = temp.split()
        x1 = float(temp[0])
        x2 = float(temp[1])
        if x1 <= 1 and x1 > 0 and x2 <= 100 and x2 > 0:
            done = True
    return x1 * x2

master_function()
    
