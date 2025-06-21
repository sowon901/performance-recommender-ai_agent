# 🎭 performance-recommender-ai_agent  
**AI 기반 공연 추천 도우미 시스템**  
ChatGPT 4o-mini, Java Spring Boot, Vue 3 기반의 개인 맞춤형 공연 추천 서비스

---

## 🧠 프로젝트 개요  
공연 정보가 넘쳐나는 시대에, 사용자 예매 이력과 관심사를 분석해  
가장 적합한 공연을 추천하는 **AI Agent 시스템**을 구현하였습니다.  
예술의전당(KOPIS) 및 YES24의 공연 정보를 기반으로 사용자 취향에 맞는 공연을 추천합니다.

---

## 🏗️ 기술 스택  

| 파트        | 기술                                                         |
|-------------|--------------------------------------------------------------|
| **Backend** | Java 17, Spring Boot 3, Spring Data JPA                      |
| **AI Agent**| OpenAI GPT-4o-mini API                                       |
| **Frontend**| Vue 3, Vite, TailwindCSS (Vercel 배포 예정)                 |
| **Database**| H2 (로컬), PostgreSQL (선택적 확장)                         |
| **API 연동**| 예술의전당(KOPIS), YES24 (크롤링 또는 외부 API 활용)       |

---

## 📂 디렉토리 구조

---

```markdown

performance-recommender-ai_agent/
├── backend/
│   └── src/main/java/com/agent/
│       ├── controller/        # REST API 엔드포인트
│       ├── service/           # 공연 추천, GPT 연동 로직
│       ├── repository/        # JPA Repository
│       └── model/             # 엔티티 클래스 (Performance, UserHistory 등)
│   └── application.yml
│
├── frontend/
│   └── src/components/        # 공연 카드, 추천 리스트 컴포넌트
│   └── src/views/             # 메인 페이지 및 화면 구성
│   └── App.vue
│   └── main.js





## 🔗 주요 기능

- 🎫 **공연 정보 자동 수집** (KOPIS / YES24 연동)
- 🤖 **ChatGPT 기반 추천 로직**
- 👀 **공연 상세 정보 및 포스터 출력**
- 📌 **사용자 활동 기록 기반 맞춤 추천**
- ☁️ **Vercel + GitHub Pages 배포 환경 구축**

---

## ✨ 프로젝트 특징

- GPT와 공연 데이터를 융합한 **실용적 AI Agent 예시**
- Java Spring + Vue3 기반의 **깔끔한 풀스택 구조**
- 공공/문화 서비스 시나리오에 적합한 **기획력 중심 설계**
- 학습/실습/포트폴리오에 적합한 **추천 시스템 구조**

---

## 🔮 향후 개발 계획

- 사용자별 **찜 기능 강화** → 선호도 학습 개선
- **YES24 예매 내역 파싱** → 추천 정확도 향상
- **카카오톡 공유 기능**, 초대형 화면용 UI 개선

---

## 📡 참고 API

- [KOPIS 공연 정보 API (공공데이터포털)](https://www.data.go.kr/data/15000517/openapi.do)
- YES24 공연정보 웹  
  (※ 공식 API 없음 → 크롤링 기반 연동 예정)


## 🙋 기여 방법

1. 이 저장소를 `fork` 후 `clone`
2. 새로운 브랜치 생성: `feat/your-feature`
3. 기능 구현 또는 수정 후 `Pull Request` 제출
