import  requests
url = ('https://api.pglt=41&q=weather+forecast&cvid=d44b6e54a06644f2a75d9edeb0c949fd&gs_lcrp=EgZjaHJvbWUqBggAEAAYQDIGCAAQABhAMgYIARBFGDkyBggCEAAYQDIGCAMQABhAMgYIBBAAGEAyBggFEAAYQDIGCAYQABhAMgYIBxAAGEAyBggIEAAYQNIBCDkyOTVqMGoxqAIAsAIA&FORM=ANNTA1&adppcEdgeStart&PCW045')
 r= requests.get(url)
 data = r.json()
 print(data)

 with open('gpfoykt548.htm') as mf:
  mf.write(r.content)