from collections import deque

n = int(input())
graph = [0] * (n+1)
cnt = 0

queue = deque()
def bfs(x, c):
    queue.append((x, c))
    graph[x] = 1

    while(queue):
        x, c = queue.popleft()
        if x == 1:
            return c

        if x%3 == 0 and not graph[x//3]:
            graph[x//3] = 1
            queue.append((x//3, c+1))
        if x%2 == 0 and not graph[x//2]:
            graph[x//2] = 1
            queue.append((x//2, c+1))
        if x>1 and not graph[x-1]:
            graph[x-1] = 1
            queue.append((x-1, c+1))

print(bfs(n,cnt))