def solution(letter):
    ## 모스부호 딕셔너리
    morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
    }

    # 공백을 기준으로 문자열을 나누기
    letter = letter.split()
    answer = ""

    for mos in letter:  # 나눈 문자열을 반복해서 모스부호 딕셔너리와 비교
        for key, value in morse.items():  # key값과 비교
            if mos == key:
                answer += value  # 문자열에 알파벳 추가
    return answer