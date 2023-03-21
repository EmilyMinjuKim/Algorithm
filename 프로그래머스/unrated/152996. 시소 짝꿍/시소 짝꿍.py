from collections import Counter

def solution(weights):
    answer = 0
    # 1 1 / 1 2 / 2 3 / 3 4
    #4 3 2 중심 2 3 4
    
    counter = Counter(weights)
    for w, n in counter.items():    #key, value
        answer += n * (n-1) // 2     #(1,1)
        for dis1, dis2 in [(1,2),(2,3),(3,4)]:
            answer += counter[w*dis1/dis2]*n
    
    return answer
