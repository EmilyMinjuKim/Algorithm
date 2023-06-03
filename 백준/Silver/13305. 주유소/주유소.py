n = int(input())
distance = list(map(int, input().split()))
liter = list(map(int, input().split()))

sum = distance[0] * liter[0]
for i in range(1, len(distance)):
    if liter[i] > liter[i-1]:
        liter[i] = liter[i-1]
    sum += distance[i] * liter[i]

print(sum)