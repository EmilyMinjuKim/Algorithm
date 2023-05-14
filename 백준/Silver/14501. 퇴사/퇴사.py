import sys
input = sys.stdin.readline

n = int(input())
schedule = []
dp = [0] * n

for _ in range(n):
    schedule.append(list(map(int, input().split())))

for i in range(n-1, -1, -1):
    day, profit = schedule[i]

    if i == n-1:
        if day == 1:
            dp[i] = profit
        continue

    if day + i <= n:
        dp[i] += profit
        if day + i < n:
            dp[i] += max(dp[day+i:])

print(max(dp))