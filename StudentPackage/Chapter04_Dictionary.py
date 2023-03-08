# Dictionary

myDictionary = {
    "name" : "nohbin",
    "job" : "Stundent"
}

print(myDictionary["name"] , "\n" , myDictionary["job"])

myDictionary["score"] = [98,99,99] 
print(myDictionary)

myDictionary["score"] = [100,100,100] 
print(myDictionary)

del myDictionary["score"]
print(myDictionary)
print("="*30)
myDictionary = {
    "name" : "nohbin",
    "job" : "Stundent",
    "score" : [100,100,100]
}

#keys()  key 리스트 만들기
print(myDictionary.keys())

#values() value 리스트 만들기
print(myDictionary.values())

#items() key,value 쌍으로 얻기
print(myDictionary.items())

#get () key 로 value return
print(myDictionary.get("name"))
print(myDictionary["score"][2]) # 두번째 list 에는 해당 value 값의 index 로 return 한다

#in() dicionary 안에 있는지 조사 return boolean
print("name" in myDictionary)
print("sung" in myDictionary)

#Set

a= "nohbin is good"
set = set(a)
print(set)
