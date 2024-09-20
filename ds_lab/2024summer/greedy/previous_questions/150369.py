def solution(cap, n, deliveries, pickups):
    answer = 0
    endPoint = 0
    
    for i in range(n - 1, -1, -1):
        if deliveries[i] != 0 or pickups[i] != 0:
            endPoint = i + 1
            break
    
    flag = False
    
    while endPoint > 0:
        carry = cap
        emptyBoxs = cap
        init = endPoint - 1
        answer += 2 * endPoint
        print(endPoint)
        for i in range(endPoint - 1, -1, -1):
            # 주기
            if carry < deliveries[i]:
                deliveries[i] -= carry
                carry = 0
            else:
                carry -= deliveries[i]
                deliveries[i] = 0
            
            # 줍기
            if emptyBoxs < pickups[i]:
                pickups[i] -= emptyBoxs
                emptyBoxs = 0
            else:
                emptyBoxs -= pickups[i]
                pickups[i] = 0
            
            if pickups[i] == 0 and deliveries[i] == 0 and (flag or init == i):
                endPoint = i
                flag = True
            else:
                flag = False
            
            print("i :", i, "flag :", flag)
        
        # print(deliveries)
        # print(pickups,"\n")
    return answer

solution(4, 5, [1, 0, 3, 1, 2], [0, 3, 0, 4, 0])
# def solution(cap, n, deliveries, pickups):
#     answer = 0
#     endPoint = 0
    
#     for i in range(n - 1, -1, -1):
#         if deliveries[i] != 0 or pickups[i] != 0:
#             endPoint = i + 1
#             break
    
#     flag = False
#     init = endPoint - 1
    
#     while endPoint > 0:
#         carry = cap
#         emptyBoxs = 0
#         answer += 2 * endPoint
#         print(endPoint)
#         for i in range(endPoint - 1, -1, -1):
#             # 주기
#             if carry < deliveries[i]:
#                 deliveries[i] -= carry
#                 carry = 0
#             else:
#                 carry -= deliveries[i]
#                 deliveries[i] = 0
            
#             # 줍기
#             if cap - (carry + emptyBoxs) < pickups[i]:
#                 pickups[i] -= cap - (carry + emptyBoxs)
#                 emptyBoxs += cap - (carry + emptyBoxs)
#                 if pickups[i] <= carry:
#                     willPickUp = pickups[i] if pickups[i] < carry else carry
#                     emptyBoxs += willPickUp
#                     pickups[i] = 0
#                     carry -= willPickUp
#                 else:
#                     pickups[i] -= carry
#                     emptyBoxs += carry
#                     carry = 0
#             else:
#                 emptyBoxs += pickups[i]
#                 pickups[i] = 0
            
#             if pickups[i] == 0 and deliveries[i] == 0:
#                 if flag or init == i:
#                     endPoint = i
#                     flag = True
        
#         print(deliveries)
#         print(pickups,"\n")
#     return answer

# def solution(cap, n, deliveries, pickups):
#     answer = 0
#     # remains = 0
#     endPoint = n
    
#     while endPoint > 0:
#     # for _ in range(3):
#         # give = 0
#         # take = 0
#         carry = cap
#         emptyBoxs = 0
#         # for i in range(n - 1, -1, -1):
#         #     give += deliveries[i]
#         #     take += pickups[i]
#         #     if give >= cap or take >= cap:
#         #         break
        
#         # carry = give if give < take else take
#         print("carry :", carry)

#         print("endPoint :", endPoint)
#         answer += 2 * endPoint
#         for i in range(endPoint - 1, -1, -1):
#             # 주기
#             if carry < deliveries[i]:
#                 deliveries[i] -= carry
#                 carry = 0
#             else:
#                 carry -= deliveries[i]
#                 deliveries[i] = 0
            
#             print("줍기 전 carry :",carry)
#             # 줍기
#             print("cap - (carry + emptyBoxs) : ", cap - (carry + emptyBoxs))
#             if cap - (carry + emptyBoxs) < pickups[i]:
#                 pickups[i] -= cap - (carry + emptyBoxs)
#                 emptyBoxs += cap - (carry + emptyBoxs)
#                 print("cap - (carry + emptyBoxs) :",cap - (carry + emptyBoxs))
#                 print("pickups[i] :", pickups[i])
#                 print(pickups[i] <= carry)
#                 if pickups[i] <= carry:
#                     willPickUp = pickups[i] if pickups[i] < carry else carry
#                     emptyBoxs += willPickUp
#                     pickups[i] = 0
#                     carry -= willPickUp
#             else:
#                 emptyBoxs += pickups[i]
#                 pickups[i] = 0
            
#             if pickups[i] == 0 and deliveries[i] == 0:
#                 endPoint = i
        
#         print(deliveries)
#         print(pickups,"\n")
#     return answer


# def solution(cap, n, deliveries, pickups):
#     answer = -1
#     # remains = 0
#     endPoint = n
    
#     # while endPoint > -1:
#     for _ in range(3):
#         give = 0
#         take = 0
#         carry = 0
#         emptyBoxs = 0
#         for i in range(n - 1, -1, -1):
#             give += deliveries[i]
#             take += pickups[i]
#             # print("i :",i)
#             # print("give, take :",give, take)
#             # print("d,p :",deliveries[i], pickups[i])
#             if give >= cap or take >= cap:
#                 break
                
        
#         carry = give if give < take else take
#         print("carry :", carry)
#         print("endPoint :", endPoint)
#         for i in range(endPoint):
#             answer += 1

#         for i in range(endPoint - 1, -1, -1):
#             # 거리 반영
#             answer += 1
            
#             print("한번 봐:",deliveries[i])
#             print("한번 봐:",pickups[i])
#             # 주기
#             if carry < deliveries[i]:
#                 deliveries[i] -= carry
#                 carry = 0
#             else:
#                 carry -= deliveries[i]
#                 deliveries[i] = 0
            
#             # 줍기
#             print("cap - (carry + emptyBoxs) : ", cap - (carry + emptyBoxs))
#             if cap - (carry + emptyBoxs) < pickups[i]:
#                 emptyBoxs += cap - (carry + emptyBoxs)
#                 pickups[i] -= cap - (carry + emptyBoxs)
#             else:
#                 emptyBoxs += pickups[i]
#                 pickups[i] = 0
            
#             if pickups[i] == 0 and deliveries[i] == 0:
#                 endPoint = i
#         print(deliveries)
#         print(pickups,"\n")
#     return answer