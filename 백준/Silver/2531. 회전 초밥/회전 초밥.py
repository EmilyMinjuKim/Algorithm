n, d, k, c = map(int, input().split())
sushi = [int(input()) for _ in range(n)]

p1, p2 = 0, k-1
check = set()

while p1 < n:
    if p2 >= n:
        p2 -= n
    if p2 < p1:
        dish = sushi[p1:] + sushi[:p2+1]
    else:
        dish = sushi[p1:p2+1]
    dishes = set(dish)
    if c not in dishes:
        dishes.add(c)
    if len(check) < len(dishes):
        check = dishes
    p1 += 1
    p2 += 1

print(len(check))