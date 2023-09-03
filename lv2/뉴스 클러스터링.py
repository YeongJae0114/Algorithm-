from collections import Counter

def set_str(str1):
    a=list()
    string_list1 = list(str1)

    for i in range(len(string_list1)):
        if i < len(string_list1)-2:
            c = string_list1[i]+string_list1[i+1]
            if c.isalpha():
                a.append(c.upper())
        if i == len(string_list1)-2:
            c = string_list1[i]+string_list1[i+1]
            if c.isalpha():
                a.append(c.upper())
    return a

def solution(str1, str2):
    
    str_list1 = set_str(str1)
    str_list2 = set_str(str2)

    Counter1 = Counter(str_list1)
    Counter2 = Counter(str_list2)

    inter = list((Counter1 & Counter2).elements())
    union = list((Counter1 | Counter2).elements())

    if len(union) == 0 and len(inter) == 0:
        return 65536
    else:
        return int(len(inter) / len(union) * 65536)
     

print(solution('aa1+aa2','AAAA12'))
