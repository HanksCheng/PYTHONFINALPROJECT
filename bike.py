import requests
import json
import sys

url = "http://data.ntpc.gov.tw/api/v1/rest/datastore/382000000A-000352-001"
data = requests.get(url).json()
args=sys.argv
print("lon:"+arg[1])
print("lat:"+arg[2])
for key1, value1 in data["result"].items():
    if key1=="records":
        for itemData in value1:
            print(itemData['sna'],itemData['sbi'])