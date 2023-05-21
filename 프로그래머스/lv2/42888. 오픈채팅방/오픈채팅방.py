def solution(record):
    answer = []
    map = {}
    
    for r in record:
        rec = r.split()
        if rec[0] in ['Enter', 'Change']:
            map[rec[1]] = rec[2]
            
    for r in record:
        rec = r.split()
        if rec[0] == 'Enter':
            answer.append(f"{map[rec[1]]}님이 들어왔습니다.")
        if rec[0] == 'Leave':
            answer.append(f"{map[rec[1]]}님이 나갔습니다.")

    return answer