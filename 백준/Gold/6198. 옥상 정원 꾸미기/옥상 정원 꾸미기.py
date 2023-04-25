import sys
r = sys.stdin.readline
n = int(r())

answer = 0
stk = []
buildings = []

for _ in range(n):
    buildings.append(int(r()))

for b in buildings:
    while stk and stk[-1]<=b:
        stk.pop()
    stk.append(b)
    answer += len(stk)-1

print(answer)