def solution(cacheSize, cities):
    cache = [] # 캐시
    time = 0 # 총 실행시간
    if cacheSize > 0:
        for city in cities:
            city = city.lower()
            if city in cache: # 캐시에 존재할 때(cache hit) 최근 위치로 갱신
                cache.remove(city)
                cache.append(city)
                cache = cache[-cacheSize:]
                time += 1
            else: # 캐시에 존재하지 않으면(cache miss)
                cache.append(city)
                cache = cache[-cacheSize:]
                time += 5        
        return time
    
    else:
        return len(cities) * 5