from __future__ import annotations


class HTTPRequest:
    """
    The Subsystem can accept requests either from the facade or client directly.
    In any case, to the Subsystem, the Facade is yet another client, and it's
    not a part of the Subsystem.
    """
    def __init__(self, UA):
        self.USER_AGENT = UA

    def sendGet(self, params):
        print("Masuk sendGet")
        print("Isi param",params)
        
        respond = "Hasil respond dari API GET"
        return respond

    def sendPost(self, params):
        print("Masuk sendPost")
        print("Isi param",params)
        
        respond = "Hasil respond dari API POST"
        return respond


class MaterialAPI:
    """
    Some facades can work with multiple subsystems at the same time.
    """
    def __init__(self, oauth = "API-KEY"):
        self.oauth = oauth
        self.host = "twelve-data1.p.rapidapi.com"

    def retrieveItemsParams (self, item,output_size):
        params = {   
                    "API-KEY": self.oauth, 
                    "HOST_URL": self.host, 
                    "output_size": output_size, 
                    "item_name": item, 
                    "type": "json", 
                }
        return params


class MaterialPrice:
    """
    The Facade class provides a simple interface to the complex logic of one or
    several subsystems. The Facade delegates the client requests to the
    appropriate objects within the subsystem. The Facade is also responsible for
    managing their lifecycle. All of this shields the client from the undesired
    complexity of the subsystem.
    """

    def __init__(self):
        """
        Depending on your application's needs, you can provide the Facade with
        existing subsystem objects or force the Facade to create them on its
        own.
        """
        self.matAPI = MaterialAPI()
        self.httpRequest = HTTPRequest("Mozilla/5.0")

    def getItemList(self, item, outputSize):
        params = self.matAPI.retrieveItemsParams(item,outputSize)

        print("Item list function")
        respon = self.httpRequest.sendGet(params)
        return respon


if __name__ == "__main__":
    # The client code may have some of the subsystem's objects already created.
    # In this case, it might be worthwhile to initialize the Facade with these
    # objects instead of letting the Facade create new instances.
    matAPI = MaterialPrice()
    print(matAPI.getItemList("balok kayu", "100"))
