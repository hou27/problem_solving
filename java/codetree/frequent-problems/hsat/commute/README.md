<div
  class="flex flex-col p-32 max-md:px-16 max-md:pt-24 w-full gap-40 flex-1 bg-white"
>
  <div class="flex items-center flex-wrap -mb-20">
    <div class="flex w-full flex-col gap-4 max-md:gap-16">
      <div class="flex w-full items-center justify-between gap-12 max-md:gap-8">
        <div class="flex items-center max-md:flex-wrap-reverse gap-8">
          <article
            class="flex flex-col mdx w-full wrap-break-word text-justify break-keep text-pretty text-start w-fit!"
          >
            <h1 id="출퇴근길">출퇴근길</h1>
          </article>
        </div>
      </div>
      <div
        class="flex gap-12 flex-wrap gap-y-8 text-label-assistive text-body2 max-md:text-caption1"
      >
        <p>평균 180분</p>
        <div class="relative bg-transparent! dark:bg-transparent! h-12">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 h-full w-px"
          ></div>
        </div>
        <p>27% 정답률</p>
        <div class="relative bg-transparent! dark:bg-transparent! h-12">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 h-full w-px"
          ></div>
        </div>
        <p>총 제출 109회</p>
      </div>
    </div>
  </div>
  <article
    class="flex flex-col mdx w-full wrap-break-word text-justify *:text-label-neutral!"
  >
    <p>
      자동차로 출퇴근을 하는 현서는 지루하지 않게 종종 길을 바꿔 다니곤 한다.
      새로운 동네를 발견하는 일은 현서의 소소한 행복이다.
    </p>
    <p>
      현서의 출근길과 퇴근길은 가끔 겹친다. 즉, 출근길에 들른 동네를 퇴근길에
      다시 지나곤 하는 것이다. 이에 대해 곰곰이 생각하던 현서는 이렇게 두 번
      들를 수 있는 동네가 그렇게 많지 않음을 깨달았다. 도로의 연결 모양, 그리고
      일방통행 여부 등으로 인해 출퇴근길 모두 방문 가능한 동네가 한정되는
      것이다.
    </p>
    <p>
      현서의 출퇴근길은 단방향 그래프로 나타낼 수 있다. 즉 각 동네를
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>1</mn></mrow
              ><annotation encoding="application/x-tex"
                >1</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">1</span></span
          ></span
        ></span
      >부터
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>n</mi></mrow
              ><annotation encoding="application/x-tex"
                >n</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.4306em"></span
            ><span class="mord mathnormal">n</span></span
          ></span
        ></span
      >까지의 번호가 매겨진
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>n</mi></mrow
              ><annotation encoding="application/x-tex"
                >n</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.4306em"></span
            ><span class="mord mathnormal">n</span></span
          ></span
        ></span
      >개의 정점으로,
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>m</mi></mrow
              ><annotation encoding="application/x-tex"
                >m</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.4306em"></span
            ><span class="mord mathnormal">m</span></span
          ></span
        ></span
      >개의 일방통행의 도로를 단방향 간선으로 삼아 그래프를 만들 수 있다. 이때
      현서의 집과 회사가 각각 정점
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>S</mi></mrow
              ><annotation encoding="application/x-tex"
                >S</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.05764em"
              >S</span
            ></span
          ></span
        ></span
      >와
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>T</mi></mrow
              ><annotation encoding="application/x-tex"
                >T</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.13889em"
              >T</span
            ></span
          ></span
        ></span
      >로 나타난다고 하면 출퇴근길은
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>S</mi></mrow
              ><annotation encoding="application/x-tex"
                >S</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.05764em"
              >S</span
            ></span
          ></span
        ></span
      >와
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>T</mi></mrow
              ><annotation encoding="application/x-tex"
                >T</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.13889em"
              >T</span
            ></span
          ></span
        ></span
      >
      사이의 경로로 나타난다.
    </p>
    <p>
      현서의 출퇴근길을 본딴 그래프가 주어지면
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>S</mi></mrow
              ><annotation encoding="application/x-tex"
                >S</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.05764em"
              >S</span
            ></span
          ></span
        ></span
      >에서
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>T</mi></mrow
              ><annotation encoding="application/x-tex"
                >T</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.13889em"
              >T</span
            ></span
          ></span
        ></span
      >로 가는 출근길 경로와
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>T</mi></mrow
              ><annotation encoding="application/x-tex"
                >T</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.13889em"
              >T</span
            ></span
          ></span
        ></span
      >에서
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>S</mi></mrow
              ><annotation encoding="application/x-tex"
                >S</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.05764em"
              >S</span
            ></span
          ></span
        ></span
      >로 가는 퇴근길 경로에 모두 포함될 수 있는 정점의 개수를 세는 프로그램을
      작성하시오.
    </p>
    <p>
      단, 출퇴근길에서 목적지 정점을 방문하고 나면 현서는 더 이상 움직이지
      않는다. 즉, 출근길 경로에
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>T</mi></mrow
              ><annotation encoding="application/x-tex"
                >T</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.13889em"
              >T</span
            ></span
          ></span
        ></span
      >는 마지막에 정확히 한 번만 등장하며, 퇴근길 경로도 마찬가지로
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>S</mi></mrow
              ><annotation encoding="application/x-tex"
                >S</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.05764em"
              >S</span
            ></span
          ></span
        ></span
      >는 마지막에 한 번만 등장해야 한다.
    </p>
  </article>
  <div class="flex flex-col gap-[28px]">
    <div
      class="flex flex-col gap-12 p-12 rounded-8 bg-background-lighter [&amp;_article&gt;pre]:bg-neutral-50 [&amp;_p&gt;code]:bg-neutral-50"
    >
      <div class="flex flex-col gap-8">
        <h3 class="text-heading4">입력</h3>
        <div class="relative bg-transparent! dark:bg-transparent! w-full">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
          ></div>
        </div>
        <div
          class="overflow-hidden select-none *:text-label-assistive! *:text-body1! break-keep *:text-start [&amp;&gt;.mdx&gt;div]:bg-white [&amp;&gt;.mdx&gt;div]:rounded-6"
        >
          <article
            class="flex flex-col mdx w-full wrap-break-word text-justify"
          >
            <p>
              첫 번째 줄에는 정수
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>n</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >n</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.4306em"></span
                    ><span class="mord mathnormal">n</span></span
                  ></span
                ></span
              >과
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>m</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >m</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.4306em"></span
                    ><span class="mord mathnormal">m</span></span
                  ></span
                ></span
              >가 공백으로 구분되어 주어집니다.<br />
              그 다음 줄부터
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>m</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >m</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.4306em"></span
                    ><span class="mord mathnormal">m</span></span
                  ></span
                ></span
              >개의 줄에는 정수
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow
                        ><msub><mi>x</mi><mi>i</mi></msub></mrow
                      ><annotation encoding="application/x-tex"
                        >x_i</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 0.5806em; vertical-align: -0.15em"
                    ></span
                    ><span class="mord"
                      ><span class="mord mathnormal">x</span
                      ><span class="msupsub"
                        ><span class="vlist-t vlist-t2"
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.3117em"
                              ><span
                                style="
                                  top: -2.55em;
                                  margin-left: 0em;
                                  margin-right: 0.05em;
                                "
                                ><span
                                  class="pstrut"
                                  style="height: 2.7em"
                                ></span
                                ><span class="sizing reset-size6 size3 mtight"
                                  ><span class="mord mathnormal mtight"
                                    >i</span
                                  ></span
                                ></span
                              ></span
                            ><span class="vlist-s">​</span></span
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.15em"
                              ><span></span></span></span></span></span></span></span></span></span
              >,
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow
                        ><msub><mi>y</mi><mi>i</mi></msub></mrow
                      ><annotation encoding="application/x-tex"
                        >y_i</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 0.625em; vertical-align: -0.1944em"
                    ></span
                    ><span class="mord"
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.03588em"
                        >y</span
                      ><span class="msupsub"
                        ><span class="vlist-t vlist-t2"
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.3117em"
                              ><span
                                style="
                                  top: -2.55em;
                                  margin-left: -0.0359em;
                                  margin-right: 0.05em;
                                "
                                ><span
                                  class="pstrut"
                                  style="height: 2.7em"
                                ></span
                                ><span class="sizing reset-size6 size3 mtight"
                                  ><span class="mord mathnormal mtight"
                                    >i</span
                                  ></span
                                ></span
                              ></span
                            ><span class="vlist-s">​</span></span
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.15em"
                              ><span></span></span></span></span></span></span></span></span></span
              >가 공백으로 구분되어 주어집니다. 이는
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow
                        ><msub><mi>x</mi><mi>i</mi></msub></mrow
                      ><annotation encoding="application/x-tex"
                        >x_i</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 0.5806em; vertical-align: -0.15em"
                    ></span
                    ><span class="mord"
                      ><span class="mord mathnormal">x</span
                      ><span class="msupsub"
                        ><span class="vlist-t vlist-t2"
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.3117em"
                              ><span
                                style="
                                  top: -2.55em;
                                  margin-left: 0em;
                                  margin-right: 0.05em;
                                "
                                ><span
                                  class="pstrut"
                                  style="height: 2.7em"
                                ></span
                                ><span class="sizing reset-size6 size3 mtight"
                                  ><span class="mord mathnormal mtight"
                                    >i</span
                                  ></span
                                ></span
                              ></span
                            ><span class="vlist-s">​</span></span
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.15em"
                              ><span></span></span></span></span></span></span></span></span></span
              >에서
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow
                        ><msub><mi>y</mi><mi>i</mi></msub></mrow
                      ><annotation encoding="application/x-tex"
                        >y_i</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 0.625em; vertical-align: -0.1944em"
                    ></span
                    ><span class="mord"
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.03588em"
                        >y</span
                      ><span class="msupsub"
                        ><span class="vlist-t vlist-t2"
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.3117em"
                              ><span
                                style="
                                  top: -2.55em;
                                  margin-left: -0.0359em;
                                  margin-right: 0.05em;
                                "
                                ><span
                                  class="pstrut"
                                  style="height: 2.7em"
                                ></span
                                ><span class="sizing reset-size6 size3 mtight"
                                  ><span class="mord mathnormal mtight"
                                    >i</span
                                  ></span
                                ></span
                              ></span
                            ><span class="vlist-s">​</span></span
                          ><span class="vlist-r"
                            ><span class="vlist" style="height: 0.15em"
                              ><span></span></span></span></span></span></span></span></span></span
              >로 가는 단방향 간선이 존재함을 의미합니다.<br />
              마지막 줄에는 정수
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>S</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >S</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.05764em"
                      >S</span
                    ></span
                  ></span
                ></span
              >,
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>T</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >T</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.13889em"
                      >T</span
                    ></span
                  ></span
                ></span
              >가 공백으로 구분되어 주어집니다.
            </p>
          </article>
        </div>
      </div>
    </div>
    <div
      class="flex flex-col gap-12 p-12 rounded-8 bg-background-lighter [&amp;_article&gt;pre]:bg-neutral-50 [&amp;_p&gt;code]:bg-neutral-50"
    >
      <div class="flex flex-col gap-8">
        <h3 class="text-heading4">제한 조건</h3>
        <div class="relative bg-transparent! dark:bg-transparent! w-full">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
          ></div>
        </div>
        <div
          class="overflow-hidden select-none *:text-label-assistive! *:text-body1! break-keep *:text-start [&amp;&gt;.mdx&gt;div]:bg-white [&amp;&gt;.mdx&gt;div]:rounded-6"
        >
          <article
            class="flex flex-col mdx w-full wrap-break-word text-justify"
          >
            <ul>
              <li>
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><mn>5</mn><mo>≤</mo><mi>n</mi><mo>≤</mo><mn>100</mn
                          ><mtext> </mtext><mn>000</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >5 \le n \le 100\,000</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7804em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord">5</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7719em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord mathnormal">n</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span class="strut" style="height: 0.6444em"></span
                      ><span class="mord">100</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
                      ></span
                      ><span class="mord">000</span></span
                    ></span
                  ></span
                >
              </li>
              <li>
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><mn>5</mn><mo>≤</mo><mi>m</mi><mo>≤</mo><mn>200</mn
                          ><mtext> </mtext><mn>000</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >5 \le m \le 200\,000</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7804em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord">5</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7719em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord mathnormal">m</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span class="strut" style="height: 0.6444em"></span
                      ><span class="mord">200</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
                      ></span
                      ><span class="mord">000</span></span
                    ></span
                  ></span
                >
              </li>
              <li>
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><mn>1</mn><mo>≤</mo><msub><mi>x</mi><mi>i</mi></msub
                          ><mo separator="true">,</mo
                          ><msub><mi>y</mi><mi>i</mi></msub
                          ><mo>≤</mo><mi>n</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le x_i, y_i \le n</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7804em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord">1</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.8304em; vertical-align: -0.1944em"
                      ></span
                      ><span class="mord"
                        ><span class="mord mathnormal">x</span
                        ><span class="msupsub"
                          ><span class="vlist-t vlist-t2"
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.3117em"
                                ><span
                                  style="
                                    top: -2.55em;
                                    margin-left: 0em;
                                    margin-right: 0.05em;
                                  "
                                  ><span
                                    class="pstrut"
                                    style="height: 2.7em"
                                  ></span
                                  ><span class="sizing reset-size6 size3 mtight"
                                    ><span class="mord mathnormal mtight"
                                      >i</span
                                    ></span
                                  ></span
                                ></span
                              ><span class="vlist-s">​</span></span
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.15em"
                                ><span></span></span></span></span></span></span
                      ><span class="mpunct">,</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
                      ></span
                      ><span class="mord"
                        ><span
                          class="mord mathnormal"
                          style="margin-right: 0.03588em"
                          >y</span
                        ><span class="msupsub"
                          ><span class="vlist-t vlist-t2"
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.3117em"
                                ><span
                                  style="
                                    top: -2.55em;
                                    margin-left: -0.0359em;
                                    margin-right: 0.05em;
                                  "
                                  ><span
                                    class="pstrut"
                                    style="height: 2.7em"
                                  ></span
                                  ><span class="sizing reset-size6 size3 mtight"
                                    ><span class="mord mathnormal mtight"
                                      >i</span
                                    ></span
                                  ></span
                                ></span
                              ><span class="vlist-s">​</span></span
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.15em"
                                ><span></span></span></span></span></span></span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span class="strut" style="height: 0.4306em"></span
                      ><span class="mord mathnormal">n</span></span
                    ></span
                  ></span
                >,
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><msub><mi>x</mi><mi>i</mi></msub
                          ><mo mathvariant="normal">≠</mo
                          ><msub><mi>y</mi><mi>i</mi></msub></mrow
                        ><annotation encoding="application/x-tex"
                          >x_i \neq y_i</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.8889em; vertical-align: -0.1944em"
                      ></span
                      ><span class="mord"
                        ><span class="mord mathnormal">x</span
                        ><span class="msupsub"
                          ><span class="vlist-t vlist-t2"
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.3117em"
                                ><span
                                  style="
                                    top: -2.55em;
                                    margin-left: 0em;
                                    margin-right: 0.05em;
                                  "
                                  ><span
                                    class="pstrut"
                                    style="height: 2.7em"
                                  ></span
                                  ><span class="sizing reset-size6 size3 mtight"
                                    ><span class="mord mathnormal mtight"
                                      >i</span
                                    ></span
                                  ></span
                                ></span
                              ><span class="vlist-s">​</span></span
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.15em"
                                ><span></span></span></span></span></span></span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel"
                        ><span class="mrel"
                          ><span class="mord vbox"
                            ><span class="thinbox"
                              ><span class="rlap"
                                ><span
                                  class="strut"
                                  style="
                                    height: 0.8889em;
                                    vertical-align: -0.1944em;
                                  "
                                ></span
                                ><span class="inner"
                                  ><span class="mord"
                                    ><span class="mrel"></span></span
                                  ></span
                                ><span
                                  class="fix"
                                ></span></span></span></span></span
                        ><span class="mrel">=</span></span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.625em; vertical-align: -0.1944em"
                      ></span
                      ><span class="mord"
                        ><span
                          class="mord mathnormal"
                          style="margin-right: 0.03588em"
                          >y</span
                        ><span class="msupsub"
                          ><span class="vlist-t vlist-t2"
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.3117em"
                                ><span
                                  style="
                                    top: -2.55em;
                                    margin-left: -0.0359em;
                                    margin-right: 0.05em;
                                  "
                                  ><span
                                    class="pstrut"
                                    style="height: 2.7em"
                                  ></span
                                  ><span class="sizing reset-size6 size3 mtight"
                                    ><span class="mord mathnormal mtight"
                                      >i</span
                                    ></span
                                  ></span
                                ></span
                              ><span class="vlist-s">​</span></span
                            ><span class="vlist-r"
                              ><span class="vlist" style="height: 0.15em"
                                ><span></span></span></span></span></span></span></span></span
                ></span>
              </li>
              <li>같은 방향으로 연결된 두 정점 쌍은 한 번만 주어집니다.</li>
              <li>
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><mn>1</mn><mo>≤</mo><mi>S</mi
                          ><mo separator="true">,</mo><mi>T</mi><mo>≤</mo
                          ><mi>n</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le S, T \le n</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7804em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord">1</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.8778em; vertical-align: -0.1944em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.05764em"
                        >S</span
                      ><span class="mpunct">,</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.13889em"
                        >T</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span class="strut" style="height: 0.4306em"></span
                      ><span class="mord mathnormal">n</span></span
                    ></span
                  ></span
                >,
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><mi>S</mi><mo mathvariant="normal">≠</mo
                          ><mi>T</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >S \neq T</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.8889em; vertical-align: -0.1944em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.05764em"
                        >S</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel"
                        ><span class="mrel"
                          ><span class="mord vbox"
                            ><span class="thinbox"
                              ><span class="rlap"
                                ><span
                                  class="strut"
                                  style="
                                    height: 0.8889em;
                                    vertical-align: -0.1944em;
                                  "
                                ></span
                                ><span class="inner"
                                  ><span class="mord"
                                    ><span class="mrel"></span></span
                                  ></span
                                ><span
                                  class="fix"
                                ></span></span></span></span></span
                        ><span class="mrel">=</span></span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span></span
                    ><span class="base"
                      ><span class="strut" style="height: 0.6833em"></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.13889em"
                        >T</span
                      ></span
                    ></span
                  ></span
                >
              </li>
              <li>
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow><mi>S</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >S</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span class="strut" style="height: 0.6833em"></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.05764em"
                        >S</span
                      ></span
                    ></span
                  ></span
                >에서
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow><mi>T</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >T</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span class="strut" style="height: 0.6833em"></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.13889em"
                        >T</span
                      ></span
                    ></span
                  ></span
                >로 가는 경로가 하나 이상 존재합니다.
              </li>
              <li>
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow><mi>T</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >T</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span class="strut" style="height: 0.6833em"></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.13889em"
                        >T</span
                      ></span
                    ></span
                  ></span
                >에서
                <span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow><mi>S</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >S</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span class="strut" style="height: 0.6833em"></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.05764em"
                        >S</span
                      ></span
                    ></span
                  ></span
                >로 가는 경로가 하나 이상 존재합니다.
              </li>
            </ul>
          </article>
        </div>
      </div>
    </div>
    <div
      class="flex flex-col gap-12 p-12 rounded-8 bg-background-lighter [&amp;_article&gt;pre]:bg-neutral-50 [&amp;_p&gt;code]:bg-neutral-50"
    >
      <div class="flex flex-col gap-8">
        <h3 class="text-heading4">출력</h3>
        <div class="relative bg-transparent! dark:bg-transparent! w-full">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
          ></div>
        </div>
        <div
          class="overflow-hidden select-none *:text-label-assistive! *:text-body1! break-keep *:text-start [&amp;&gt;.mdx&gt;div]:bg-white [&amp;&gt;.mdx&gt;div]:rounded-6"
        >
          <article
            class="flex flex-col mdx w-full wrap-break-word text-justify"
          >
            <p>
              첫째 줄에 출근길과 퇴근길 모두에서 방문 가능한 정점의 개수를
              출력한다.
            </p>
          </article>
        </div>
      </div>
    </div>
    <div
      class="flex flex-col gap-12 p-12 rounded-8 bg-background-lighter [&amp;_article&gt;pre]:bg-neutral-50 [&amp;_p&gt;code]:bg-neutral-50"
    >
      <div class="flex flex-col gap-8">
        <h3 class="text-heading4">입력 예제</h3>
        <div class="relative bg-transparent! dark:bg-transparent! w-full">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
          ></div>
        </div>
      </div>
      <div class="flex flex-col gap-16 p-10 rounded-6 bg-neutral-200">
        <div class="flex flex-col gap-8">
          <h3 class="text-heading4">예제 1</h3>
          <div class="relative bg-transparent! dark:bg-transparent! w-full">
            <div
              class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
            ></div>
          </div>
        </div>
        <div class="flex flex-col gap-4">
          <p class="text-heading6 text-label-assistive">입력</p>
          <div
            class="rounded-6 bg-neutral-50 p-[12px_20px_12px_16px] overflow-x-auto border border-stroke-light"
          >
            <pre class="font-code text-[14px] text-label-neutral">
5 9
1 2
1 4
2 1
2 3
3 4
3 5
4 1
4 3
5 1
1 3
</pre
            >
          </div>
        </div>
        <div class="flex flex-col gap-4">
          <p class="text-heading6 text-label-assistive">출력</p>
          <div
            class="rounded-6 bg-neutral-50 p-[12px_20px_12px_16px] overflow-x-auto border border-stroke-light"
          >
            <pre class="font-code text-[14px] text-label-neutral">
1
</pre
            >
          </div>
        </div>
        <div class="flex flex-col gap-4">
          <p class="text-heading6 text-label-assistive">예제 설명</p>
          <div
            class="rounded-6 bg-neutral-50 p-[12px_20px_12px_16px] overflow-x-auto border border-stroke-light"
          >
            <details open="" class="flex flex-col gap-8 text-body1">
              <summary class="cursor-pointer">접기</summary>
              <article
                class="flex flex-col mdx w-full wrap-break-word text-justify *:text-body2 break-keep text-start"
              >
                <p align="center">
                  <img
                    class="cursor-pointer"
                    type="button"
                    aria-haspopup="dialog"
                    aria-expanded="false"
                    aria-controls="radix-_r_5a_"
                    data-state="closed"
                    data-slot="dialog-trigger"
                    src="https://contents.codetree.ai/problems/4078/images/d921b174-9909-4d35-9a09-57c1f5ab32bb.png"
                  />
                </p>
                <p>예제 1번에서, 출퇴근길에 모두 방문 가능한 점은 4번뿐이다.</p>
              </article>
            </details>
          </div>
        </div>
      </div>
      <div class="flex flex-col gap-16 p-10 rounded-6 bg-neutral-200">
        <div class="flex flex-col gap-8">
          <h3 class="text-heading4">예제 2</h3>
          <div class="relative bg-transparent! dark:bg-transparent! w-full">
            <div
              class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
            ></div>
          </div>
        </div>
        <div class="flex flex-col gap-4">
          <p class="text-heading6 text-label-assistive">입력</p>
          <div
            class="rounded-6 bg-neutral-50 p-[12px_20px_12px_16px] overflow-x-auto border border-stroke-light"
          >
            <pre class="font-code text-[14px] text-label-neutral">
8 14
1 2
1 5
1 7
2 3
3 1
4 1
4 2
5 4
5 8
6 2
6 3
7 1
7 6
8 7
6 5
</pre
            >
          </div>
        </div>
        <div class="flex flex-col gap-4">
          <p class="text-heading6 text-label-assistive">출력</p>
          <div
            class="rounded-6 bg-neutral-50 p-[12px_20px_12px_16px] overflow-x-auto border border-stroke-light"
          >
            <pre class="font-code text-[14px] text-label-neutral">
4
</pre
            >
          </div>
        </div>
        <div class="flex flex-col gap-4">
          <p class="text-heading6 text-label-assistive">예제 설명</p>
          <div
            class="rounded-6 bg-neutral-50 p-[12px_20px_12px_16px] overflow-x-auto border border-stroke-light"
          >
            <details open="" class="flex flex-col gap-8 text-body1">
              <summary class="cursor-pointer">접기</summary>
              <article
                class="flex flex-col mdx w-full wrap-break-word text-justify *:text-body2 break-keep text-start"
              >
                <p align="center">
                  <img
                    class="cursor-pointer"
                    type="button"
                    aria-haspopup="dialog"
                    aria-expanded="false"
                    aria-controls="radix-_r_5d_"
                    data-state="closed"
                    data-slot="dialog-trigger"
                    src="https://contents.codetree.ai/problems/4078/images/35a3de67-1f50-44a5-9d06-ac81a0292e29.png"
                  />
                </p>
                <p>
                  예제 2번에서, 출퇴근길에 모두 방문 가능한 점은 다음의 네
                  개이다: 1, 2, 3, 7.
                </p>
              </article>
            </details>
          </div>
        </div>
      </div>
    </div>
    <div
      class="flex flex-col gap-12 p-12 rounded-8 bg-background-lighter [&amp;_article&gt;pre]:bg-neutral-50 [&amp;_p&gt;code]:bg-neutral-50"
    >
      <div class="flex flex-col gap-8">
        <h3 class="text-heading4">제한</h3>
        <div class="relative bg-transparent! dark:bg-transparent! w-full">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 w-full h-px"
          ></div>
        </div>
        <div
          class="overflow-hidden select-none *:text-label-assistive! *:text-body1! break-keep *:text-start [&amp;&gt;.mdx&gt;div]:bg-white [&amp;&gt;.mdx&gt;div]:rounded-6"
        >
          <div>
            <p>• Time Limit: 3000 ms</p>
            <p>• Memory Limit: 176 MiB</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
