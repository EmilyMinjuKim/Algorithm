n = int(input())

# A B C : 300 60 10
button = [300,60,10]
cnt = [0] * 3

for i in range(3):
    if n >= button[i]:
        cnt[i] = n // button[i]
        n %= button[i]

if n != 0:
    print(-1)
else:
    print(*cnt)