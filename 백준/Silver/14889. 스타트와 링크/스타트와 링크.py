import sys; input = sys.stdin.readline
from itertools import combinations

result = []
n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

nums = [i for i in range(0,n)]

p = list(combinations(nums, int(n/2)))
power = [0] * len(p)
for i in range(len(p)):
    p_list = list(combinations(p[i], 2))
    for j in p_list:
        x, y = j
        power[i] += graph[x][y] + graph[y][x]

for i in range(int(len(power)/2)):
    j = len(power)-i-1
    result.append(abs(power[i]-power[j]))

print(min(result))