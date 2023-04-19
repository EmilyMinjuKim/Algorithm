from collections import deque
k = int(input())
result = []

dx = [-1, 1, 2, 2, 1, -1, -2, -2]
dy = [2, 2, 1, -1, -2, -2, -1, 1]

def bfs(x1,y1,x2,y2):
    queue = deque()
    queue.append((x1,y1))
    graph[x1][y1] = 1

    while(queue):
        x,y = queue.popleft()

        if (x,y) == (x2,y2):
            return graph[x][y]-1

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < l and 0 <= ny < l and graph[nx][ny] == 0:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))



for _ in range(k):
    l = int(input())
    x1, y1 = map(int, input().split())
    x2, y2 = map(int, input().split())

    graph = [[0] * l for _ in range(l)]
    result.append(bfs(x1,y1,x2,y2))

print(*result, end=' ')
