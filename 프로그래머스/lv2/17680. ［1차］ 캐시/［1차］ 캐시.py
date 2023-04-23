def solution(cacheSize, cities):
    answer = 0
    cache = []
    
    for city in cities:
        city = city.upper()
        if cacheSize == 0:
            answer += 5
            continue
            
        if city not in cache:
            cache.append(city)
            if len(cache) > cacheSize:
                cache.pop(0)
            answer += 5
        else:
            cache.remove(city)
            cache.append(city)
            answer += 1
        
        
    return answer