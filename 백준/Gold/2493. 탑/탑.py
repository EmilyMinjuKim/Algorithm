import sys
r = sys.stdin.readline

n = int(r())
t_list = list(map(int, r().split()))
answer = []
stk = []

for i in range(n):
    h = t_list[i]
    while stk:
        if stk[-1][0] > h:
            answer.append(stk[-1][1]+1)
            break
        else:
            stk.pop()
    if not stk:
        answer.append(0)
    stk.append([h, i])

print(*answer)