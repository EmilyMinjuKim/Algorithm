s = input()

count = {'0' : 0, '1' : 0}
num = s[0]
count[num] += 1

for i in range(1,len(s)):
    if(s[i] == num):
        continue
    else:
        num = s[i]
        count[num] += 1

print(min(count.values()))