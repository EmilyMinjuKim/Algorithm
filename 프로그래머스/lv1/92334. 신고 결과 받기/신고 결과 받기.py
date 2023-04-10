def solution(id_list, report, k):
    rp_list = [[] for _ in range(len(id_list))]
    answer, rp_cnt = [0] * len(id_list), [0] * len(id_list)
    final_list = []

    for i in report:
        each_list = i.split()
        s = id_list.index(each_list[0])
        e = id_list.index(each_list[1])
        if e not in rp_list[s]:
            rp_cnt[e] += 1
            rp_list[s].append(e)
            
    for i in range(len(rp_cnt)):
        if rp_cnt[i] >= k:
            final_list.append(i)

    for idx in range(len(rp_list)):
        for i in rp_list[idx]:
            if i in final_list:
                answer[idx] += 1
    
    
    
    return answer