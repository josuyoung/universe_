
    
mul = 1

import numpy as np
from scipy.stats import mode
num = list()
tot = 0
avg = 0
for i in range(10):
    print("실수를 입력하세요","("+str(i+1)+"/10):",end = "")
    num.append(float(input()))
    tot += num[i]
    mul *= num[i]
avg = tot/len(num);
print(sorted(num)[1])
print("전체 개수",len(num))
print("합:",sum(num))
num = np.array(num)
print("평균:",round(num.mean(),2))
print("중앙값",np.median(num))
print("최빈값",mode(num)[0][0])
print("편차:",round(num.std(),2))
print("모두를 곱한값:",round(num.prod(),4))




def sub_func_meal(is_latemeal):
    if (is_latemeal):
        print("배부르게 불태워")
    else:
        print("굶주리며 불태워")
        
def func_hw(is_hw,is_top,is_latemeal):
    print("고민시작")
    
    if is_hw:
        print("내손으로 직접 과제해결!!")
        sub_func_meal(is_latemeal)
    else:
        print("과탑의 도움 받을래?")
        if is_top:
            sub_func_meal(is_latemeal)
        else:
            print("내일 배끼고, 지금은잔다")
    print("고민해결")
    
    
func_hw(False,False,True)
