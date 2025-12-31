x = int(input())
y = int(input())
if(0 < x and 0 < y):
    print(1)
elif(0 < x and 0 > y):
    print(4)
elif(0 > x and 0 < y):
    print(2)
elif(0 > x and 0 > y):
    print(3)