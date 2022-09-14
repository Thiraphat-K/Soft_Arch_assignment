# Architectural Patterns/Styles

**By 63010467 ธีรพัฒน์ เกตุสิงห์น้อย**

## GPSd

เป็นโปรแกรมซอฟต์แวร์คอมพิวเตอร์ที่รวบรวมข้อมูลจากเครื่องรับ GPS และให้ข้อมูลผ่านเครือข่าย IP ให้กับ Client application หลายตัวใน Server-Client application architecture ซึ่ง GPSd อาจทำงานเป็น daemon เพื่อทำงานอย่างโปร่งใสเป็นงานพื้นหลังของ Server

### Architectural Styles : Client-Server

<img src="https://www.trinetrawireless.com/wp-content/uploads/2020/04/how-it-works-1.jpg" width="605" height="405"/>

เนื่องจาก GPSd ให้บริการแก่ Client แบบกระจายหลายรายพร้อมกันได้

### Quality attribute scenarios

#### Scenario 1 - Usability

```
Source of Stimulus : ผู้ใช้งาน
Stimulus : เรียนรู้การใช้งาน
Environment : Runtime
Artifact : เกิดขั้นตอน Generate GPS
Response : GPS logic
Response Measure : ความเข้าใจใน GPS
```

#### Scenario 2 - Integrability

```
Source of Stimulus : ผู้ใช้งาน
Stimulus : Integrate GPSd ให้ใช้งานกับ Python
Environment : Development, Deployment, Runtime, Integration
Artifact : All System
Response : Integrate ได้หรือไม่
Response Measure : Integrate แล้วสามารถใช้งานได้
```

#### Scenario 3 - Security

```
Source of Stimulus : Hacker
Stimulus : Libraries ที่มี Virus หรือ Malware
Environment : Development, Deployment, Runtime
Artifact : System Services
Response : Data, Resource
Response Measure : Intrusion detection devices และ backups
```

## Audacity

เป็นโปรแกรมสำหรับการแก้ไขที่เกี่ยวกับเรื่องเสียง ไม่ว่าจะเป็นการอัดเสียง การตัดต่อไฟล์เสียง หรือการทำการมิกซYเสียง ซึ่งเป็นโปรแกรมที่มีความนิยมมากในหมู่ Sound Engineer

### Architectural Styles : Plugin

มีลักษณะเป็นชั้น ๆ อยู่บน Libraries ซึ่งการทำงานส่วนใหญ่ของโปรแกรมจะขึ้นอยู่กับ Libraries ที่เป็น function build-in และสามารถรองรับ LADSPA ซึ่งเป็น plugin ส่วนเสริมสำหรับการดาวน์โหลด Audio Effect อื่นๆ มาใช้งานได้ในการเพิ่มคำสั่งในการทำงานให้โปรแกรมนั้น ไม่จำเป็นที่จะต้องมี code อยู่ในโปรแกรมหลัก

### Quality attribute scenarios

#### Scenario 1 - Usability

```
Source of Stimulus : ผู้ใช้งาน
Stimulus : เรียนรู้การใช้งาน
Environment : Runtime
Artifact : GUI, Voice Editor
Response : ช่วยให้เข้าใจในการใช้งาน
Response Measure : ความพึงพอใจกับการใช้งาน
```

#### Scenario 2 - Integrability

```
Source of Stimulus : ผู้ใช้งาน
Stimulus : ต้องการ add-Plugin
Environment : Development, Deployment, Runtime, Integration
Artifact : Specific Component
Response : New Configuration
Response Measure : มี Plugin ใหม่ให้ใช้งาน
```

#### Scenario 3 - Security

```
Source of Stimulus : Hacker
Stimulus : Libraries ที่ใช้งานไม่ปลอดภัย
Environment : Plugin Online
Artifact : System Services
Response : Resource
Response Measure : Intrusion detection devices
```

## Joomla

เป็น Content Management System (CMS) ที่ได้รับความนิยมใน ปัจจุบัน โดยมีความสามารถในการจัดการกับเว็บไซต์ เช่น การเพิ่ม บทความ การเพิ่มรูปภาพ หรือการปรับแต่ง Module ต่างๆ โดยไม่จำเป็นต้องมีการสร้างระบบ Frontend และ Backend ขึ้นมาด้วยตนเอง สามารถที่จะศึกษาวิธีการติดตั้ง และการปรับแต่ง CMS ได้โดยตรง ซึ่งทำให้ระยะเวลาในการพัฒนาเว็บไซต์นั้นประหยัดเวลามากขึ้น

### Architectural Styles : Plugin

MVC มีการใช้งาน MySQL และ PostgreSQL เพื่อจัดเก็บข้อมูล มี คุณสมบัติหลากหลาย เช่น การ cache page, blog, post เป็นต้น

![image](https://www.pulsar-agency.com/images/joomla/architecture-joomla.JPG)
Image : Joomla! CMS Architecture

### Quality attribute scenarios

#### Scenario 1 - Usability

```
Source of Stimulus : ผู้ใช้งาน
Stimulus : การพัฒนา Website
Environment : Component, Runtime
Artifact : Website
Response : Website มีส่วนประกอบตามที่ต้องการ
Response Measure : ความพึงพอใจของผู้ใช้
```

#### Scenario 2 - Integrability

```
Source of Stimulus : ผู้พัฒนาโปรแกรม
Stimulus : Extensions
Environment : Version ของ Extensions
Artifact : Joomla Extension
Response : New Extension
Response Measure : มี Extension ใหม่ให้ใช้งาน
```

#### Scenario 3 - Performance

```
Source of Stimulus : ผู้ใช้งาน
Stimulus : การแก้ไข Content
Environment : Build Time
Artifact : Content ที่ต้องการแก้ไข
Response : Content ที่ทำการแก้ไขแล้ว
Response Measure : ปริมาณ Content
```