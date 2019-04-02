# Cathay_homework
- 新增員工資料

        POST
        http://localhost:8080/api/employee/add?number=0001&name=Darren&departmentId=2&gender=M&telephone=0912345678&address=台北市信義區松仁路1號&age=21
        {
            "id": 33,
            "number": "0001",
            "name": "Darren",
            "departmentId": 2,
            "gender": "M",
            "telephone": "0912345678",
            "address": "台北市信義區松仁路1號",
            "age": 21,
            "createDate": 1554209208239,
            "modifyDate": 1554209208239
        }
        
- 更新員工資料

        PUT
        http://localhost:8080/api/employee/33?name=DarrenChi&departmentId=1&gender=M&telephone=0987654321&address=台北市信義區&age=28
        {
            "id": 33,
            "number": "0001",
            "name": "DarrenChi",
            "departmentId": 1,
            "gender": "M",
            "telephone": "0987654321",
            "address": "台北市信義區",
            "age": 28,
            "createDate": 1554209208239,
            "modifyDate": 1554210739968
        }
        
- 刪除員工資料

        DELETE
        http://localhost:8080/api/employee/33
        
- 新增部門資料

        POST
        http://localhost:8080/api/department/add?number=1&name=HR
        {
            "id": 1,
            "number": "1",
            "name": "HR"
        }
        
- 更新部門資料

        PUT
        http://localhost:8080/api/department/1?number=1&name=IT
        {
            "id": 1,
            "number": "1",
            "name": "IT"
        }
        
- 刪除部門資料

        DELETE
        http://localhost:8080/api/department/1
        
- 查詢員工資料，「動態條件」

        GET
        範例1 (查詢名字有Darren字串的第1頁10筆資料) :
        http://localhost:8080/api/employee/search?name=Darren&page=0&perPage=10
        [{"id":66,"number":"0001","name":"Darren1","departmentId":1,"gender":"M","telephone":"0999999991","address":"台北市信義區松仁路","age":21,"createDate":1554211697393,"modifyDate":1554211697393},{"id":67,"number":"0002","name":"Darren2","departmentId":1,"gender":"M","telephone":"0999999992","address":"台北市信義區松仁路","age":21,"createDate":1554211710155,"modifyDate":1554211710155},{"id":68,"number":"0003","name":"Darren3","departmentId":1,"gender":"M","telephone":"0999999993","address":"台北市信義區松仁路","age":21,"createDate":1554211719567,"modifyDate":1554211719567},{"id":69,"number":"0004","name":"Darren4","departmentId":1,"gender":"M","telephone":"0999999994","address":"台北市信義區松仁路","age":21,"createDate":1554211725354,"modifyDate":1554211725354},{"id":70,"number":"0005","name":"Darren5","departmentId":1,"gender":"M","telephone":"0999999995","address":"台北市信義區松仁路","age":25,"createDate":1554211733846,"modifyDate":1554211733846},{"id":71,"number":"0006","name":"Darren6","departmentId":1,"gender":"M","telephone":"0999999996","address":"台北市信義區松仁路","age":21,"createDate":1554211742693,"modifyDate":1554211742693},{"id":72,"number":"0007","name":"Darren7","departmentId":1,"gender":"M","telephone":"0999999997","address":"台北市信義區松仁路","age":21,"createDate":1554211750747,"modifyDate":1554211750747},{"id":73,"number":"0008","name":"Darren8","departmentId":1,"gender":"M","telephone":"0999999998","address":"台北市信義區松仁路","age":21,"createDate":1554211758603,"modifyDate":1554211758603},{"id":74,"number":"0009","name":"Darren9","departmentId":1,"gender":"M","telephone":"0999999999","address":"台北市信義區松仁路","age":21,"createDate":1554211765296,"modifyDate":1554211765296},{"id":75,"number":"0010","name":"Darren10","departmentId":1,"gender":"M","telephone":"0999999910","address":"台北市信義區松仁路","age":21,"createDate":1554211778817,"modifyDate":1554211778817}]
        
        範例2 (查詢名字有Darren字串的第2頁10筆資料) :
        http://localhost:8080/api/employee/search?name=Darren&page=1&perPage=10
        [{"id":81,"number":"0016","name":"Darren16","departmentId":1,"gender":"M","telephone":"0999999916","address":"台北市信義區松仁路","age":26,"createDate":1554211859146,"modifyDate":1554211859146},{"id":82,"number":"0017","name":"Darren17","departmentId":1,"gender":"M","telephone":"0999999917","address":"台北市信義區松仁路","age":21,"createDate":1554211880004,"modifyDate":1554211880004}]
        
        範例3 (查詢原編有0和名字有Dar的第1頁10筆資料) :
        [{"id":66,"number":"0001","name":"Darren1","departmentId":1,"gender":"M","telephone":"0999999991","address":"台北市信義區松仁路","age":21,"createDate":1554211697393,"modifyDate":1554211697393},{"id":67,"number":"0002","name":"Darren2","departmentId":1,"gender":"M","telephone":"0999999992","address":"台北市信義區松仁路","age":21,"createDate":1554211710155,"modifyDate":1554211710155},{"id":68,"number":"0003","name":"Darren3","departmentId":1,"gender":"M","telephone":"0999999993","address":"台北市信義區松仁路","age":21,"createDate":1554211719567,"modifyDate":1554211719567},{"id":69,"number":"0004","name":"Darren4","departmentId":1,"gender":"M","telephone":"0999999994","address":"台北市信義區松仁路","age":21,"createDate":1554211725354,"modifyDate":1554211725354},{"id":70,"number":"0005","name":"Darren5","departmentId":1,"gender":"M","telephone":"0999999995","address":"台北市信義區松仁路","age":25,"createDate":1554211733846,"modifyDate":1554211733846},{"id":71,"number":"0006","name":"Darren6","departmentId":1,"gender":"M","telephone":"0999999996","address":"台北市信義區松仁路","age":21,"createDate":1554211742693,"modifyDate":1554211742693},{"id":72,"number":"0007","name":"Darren7","departmentId":1,"gender":"M","telephone":"0999999997","address":"台北市信義區松仁路","age":21,"createDate":1554211750747,"modifyDate":1554211750747},{"id":73,"number":"0008","name":"Darren8","departmentId":1,"gender":"M","telephone":"0999999998","address":"台北市信義區松仁路","age":21,"createDate":1554211758603,"modifyDate":1554211758603},{"id":74,"number":"0009","name":"Darren9","departmentId":1,"gender":"M","telephone":"0999999999","address":"台北市信義區松仁路","age":21,"createDate":1554211765296,"modifyDate":1554211765296},{"id":75,"number":"0010","name":"Darren10","departmentId":1,"gender":"M","telephone":"0999999910","address":"台北市信義區松仁路","age":21,"createDate":1554211778817,"modifyDate":1554211778817}]
        
        範例4 (查詢原編有0和名字有Dar的第2頁10筆資料) :
        [{"id":81,"number":"0016","name":"Darren16","departmentId":1,"gender":"M","telephone":"0999999916","address":"台北市信義區松仁路","age":26,"createDate":1554211859146,"modifyDate":1554211859146},{"id":82,"number":"0017","name":"Darren17","departmentId":1,"gender":"M","telephone":"0999999917","address":"台北市信義區松仁路","age":21,"createDate":1554211880004,"modifyDate":1554211880004}]
        
        範例5 (查詢名字有Lisa字串，age=21的第1頁10筆資料) :
        http://localhost:8080/api/employee/search?name=Lisa&age=21&page=0&perPage=10
        [{"id":76,"number":"0011","name":"Lisa11","departmentId":1,"gender":"M","telephone":"0999999911","address":"台北市信義區松仁路","age":21,"createDate":1554211807984,"modifyDate":1554211807984},{"id":77,"number":"0012","name":"Lisa12","departmentId":1,"gender":"M","telephone":"0999999912","address":"台北市信義區松仁路","age":21,"createDate":1554211817162,"modifyDate":1554211817162},{"id":79,"number":"0014","name":"Lisa14","departmentId":1,"gender":"M","telephone":"0999999914","address":"台北市信義區松仁路","age":21,"createDate":1554211835795,"modifyDate":1554211835795},{"id":80,"number":"0015","name":"Lisa15","departmentId":1,"gender":"M","telephone":"0999999915","address":"台北市信義區松仁路","age":21,"createDate":1554211844399,"modifyDate":1554211844399}]
        
        
- 動態條件假資料如下:

        [{"id": 66,"number": "0001","name": "Darren1","departmentId": 1,"gender": "M","telephone": "0999999991","address": "台北市信義區松仁路","age": 21,"createDate": 1554211697393,"modifyDate": 1554211697393},    
        {"id": 67,"number": "0002","name": "Darren2","departmentId": 1,"gender": "M","telephone": "0999999992","address": "台北市信義區松仁路","age": 21,"createDate": 1554211710155,"modifyDate": 1554211710155},    
        {"id": 68,"number": "0003","name": "Darren3","departmentId": 1,"gender": "M","telephone": "0999999993","address": "台北市信義區松仁路","age": 21,"createDate": 1554211719567,"modifyDate": 1554211719567},    
        {"id": 69,"number": "0004","name": "Darren4","departmentId": 1,"gender": "M","telephone": "0999999994","address": "台北市信義區松仁路","age": 21,"createDate": 1554211725354,"modifyDate": 1554211725354},    
        {"id": 70,"number": "0005","name": "Darren5","departmentId": 1,"gender": "M","telephone": "0999999995","address": "台北市信義區松仁路","age": 25,"createDate": 1554211733846,"modifyDate": 1554211733846}, 
        {"id": 71,"number": "0006","name": "Darren6","departmentId": 1,"gender": "M","telephone": "0999999996","address": "台北市信義區松仁路","age": 21,"createDate": 1554211742693,"modifyDate": 1554211742693},    
        {"id": 72,"number": "0007","name": "Darren7","departmentId": 1,"gender": "M","telephone": "0999999997","address": "台北市信義區松仁路","age": 21,"createDate": 1554211750747,"modifyDate": 1554211750747},    
        {"id": 73,"number": "0008","name": "Darren8","departmentId": 1,"gender": "M","telephone": "0999999998","address": "台北市信義區松仁路","age": 21,"createDate": 1554211758603,"modifyDate": 1554211758603},    
        {"id": 74,"number": "0009","name": "Darren9","departmentId": 1,"gender": "M","telephone": "0999999999","address": "台北市信義區松仁路","age": 21,"createDate": 1554211765296,"modifyDate": 1554211765296},    
        {"id": 75,"number": "0010","name": "Darren10","departmentId": 1,"gender": "M","telephone": "0999999910","address": "台北市信義區松仁路","age": 21,"createDate": 1554211778817,"modifyDate": 1554211778817},   
        {"id": 76,"number": "0011","name": "Lisa11","departmentId": 1,"gender": "M","telephone": "0999999911","address": "台北市信義區松仁路","age": 21,"createDate": 1554211807984,"modifyDate": 1554211807984},    
        {"id": 77,"number": "0012","name": "Lisa12","departmentId": 1,"gender": "M","telephone": "0999999912","address": "台北市信義區松仁路","age": 21,"createDate": 1554211817162,"modifyDate": 1554211817162},   
        {"id": 78,"number": "0013","name": "Lisa13","departmentId": 1,"gender": "M","telephone": "0999999913","address": "台北市信義區松仁路","age": 23,"createDate": 1554211827111,"modifyDate": 1554211827111},   
        {"id": 79,"number": "0014","name": "Lisa14","departmentId": 1,"gender": "M","telephone": "0999999914","address": "台北市信義區松仁路","age": 21,"createDate": 1554211835795,"modifyDate": 1554211835795},  
        {"id": 80,"number": "0015","name": "Lisa15","departmentId": 1,"gender": "M","telephone": "0999999915","address": "台北市信義區松仁路","age": 21,"createDate": 1554211844399,"modifyDate": 1554211844399},  
        {"id": 81,"number": "0016","name": "Darren16","departmentId": 1,"gender": "M","telephone": "0999999916","address": "台北市信義區松仁路","age": 26,"createDate": 1554211859146,"modifyDate": 1554211859146}, 
        {"id": 82,"number": "0017","name": "Darren17","departmentId": 1,"gender": "M","telephone": "0999999917","address": "台北市信義區松仁路","age": 21,"createDate": 1554211880004,"modifyDate": 1554211880004}]