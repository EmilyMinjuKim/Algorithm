def solution(n):
    answer = ''
    num = ['4','1','2']

    while n > 0:
        idx = n%3   # 0 1 2
        n //= 3
        answer = num[idx] + answer
        if idx == 0:
            n -= 1
    
    return answer