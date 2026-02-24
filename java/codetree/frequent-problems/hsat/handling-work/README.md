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
            <h1 id="업무-처리">업무 처리</h1>
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
        <p>49% 정답률</p>
        <div class="relative bg-transparent! dark:bg-transparent! h-12">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 h-full w-px"
          ></div>
        </div>
        <p>총 제출 59회</p>
      </div>
    </div>
  </div>
  <article
    class="flex flex-col mdx w-full wrap-break-word text-justify *:text-label-neutral!"
  >
    <p>
      어떤 부서의 업무 조직은 완전이진트리 모양이다. 즉, 부서장이 루트이고
      부서장 포함 각 직원은 왼쪽과 오른쪽의 부하 직원을 가진다. 부하 직원이 없는
      직원을 말단 직원이라고 부른다.
    </p>
    <p>
      모든 말단 직원은 부서장까지 올라가는 거리가 동일하다. 조직도 트리의 높이는
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>H</mi></mrow
              ><annotation encoding="application/x-tex"
                >H</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.08125em"
              >H</span
            ></span
          ></span
        ></span
      >이다. 아래는 높이가
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
      >이고 업무가
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>3</mn></mrow
              ><annotation encoding="application/x-tex"
                >3</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">3</span></span
          ></span
        ></span
      >개인 조직도를 보여준다.
    </p>
    <p align="center">
      <img
        class="cursor-pointer"
        type="button"
        aria-haspopup="dialog"
        aria-expanded="false"
        aria-controls="radix-_r_df_"
        data-state="closed"
        data-slot="dialog-trigger"
        src="https://contents.codetree.ai/problems/4083/images/aa8898f0-bfd1-4767-84ff-1d9997fc4026.jpeg"
      />
    </p>
    <p>
      업무는
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>R</mi></mrow
              ><annotation encoding="application/x-tex"
                >R</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.00773em"
              >R</span
            ></span
          ></span
        ></span
      >일 동안 진행된다. 처음에 말단 직원들만 각각
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>K</mi></mrow
              ><annotation encoding="application/x-tex"
                >K</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6833em"></span
            ><span class="mord mathnormal" style="margin-right: 0.07153em"
              >K</span
            ></span
          ></span
        ></span
      >개의 순서가 정해진 업무를 가지고 있다. 각 업무는 업무 번호가 있다. 각
      날짜에 남은 업무가 있는 경우, 말단 직원은 하나의 업무를 처리해서 상사에게
      올린다. 다른 직원들도, 대기하는 업무가 있는 경우 업무를 올라온 순서대로
      하나 처리해서 상사에게 올린다. 단, 홀수 번째 날짜에는 왼쪽 부하 직원이
      올린 업무를, 짝수 번째 날짜에는 오른쪽 부하 직원이 올린 업무를 처리한다.
    </p>
    <p>
      부서장이 처리한 일은 완료된 것이다. 업무를 올리는 것은 모두 동시에
      진행한다. 따라서 그날 올린 업무를 상사가 처리하는 것은 그 다음날에야
      가능하다.
    </p>
    <p>
      부서의 조직과 대기하는 업무들을 입력 받아 처리가 완료된 업무들의 번호의
      합을 계산하는 프로그램을 작성하라.
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
              첫 줄에 정수
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>H</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >H</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.08125em"
                      >H</span
                    ></span
                  ></span
                ></span
              >,
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>K</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >K</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.07153em"
                      >K</span
                    ></span
                  ></span
                ></span
              >,
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>R</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >R</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.00773em"
                      >R</span
                    ></span
                  ></span
                ></span
              >이 공백을 두고 주어진다.
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>H</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >H</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.08125em"
                      >H</span
                    ></span
                  ></span
                ></span
              >는 조직도의 높이,
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>K</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >K</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.07153em"
                      >K</span
                    ></span
                  ></span
                ></span
              >는 말단에 대기하는 업무의 개수,
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>R</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >R</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.00773em"
                      >R</span
                    ></span
                  ></span
                ></span
              >은 업무가 진행되는 날짜 수를 의미한다.
            </p>
            <p>
              그 다음 줄부터 각각의 말단 직원에 대해 대기하는 업무 번호를
              나타내는
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>K</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >K</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.07153em"
                      >K</span
                    ></span
                  ></span
                ></span
              >개의 정수가 순서대로 주어진다.
            </p>
            <p>제일 왼쪽의 말단 직원부터 순서대로 주어진다.</p>
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
                          ><mn>1</mn><mo>≤</mo><mi>H</mi><mo>≤</mo
                          ><mn>10</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le H \le 10</annotation
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
                        style="height: 0.8193em; vertical-align: -0.136em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.08125em"
                        >H</span
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
                      ><span class="mord">10</span></span
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
                          ><mn>1</mn><mo>≤</mo><mi>K</mi><mo>≤</mo
                          ><mn>10</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le K \le 10</annotation
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
                        style="height: 0.8193em; vertical-align: -0.136em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.07153em"
                        >K</span
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
                      ><span class="mord">10</span></span
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
                          ><mn>1</mn><mo>≤</mo><mi>R</mi><mo>≤</mo><mn>1</mn
                          ><mtext> </mtext><mn>000</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le R \le 1\,000</annotation
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
                        style="height: 0.8193em; vertical-align: -0.136em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.00773em"
                        >R</span
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
                      ><span class="mord">1</span
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
                          ><mn>1</mn><mo>≤</mo
                          ><mrow
                            ><mtext mathvariant="monospace">업무</mtext
                            ><mtext>&nbsp;</mtext
                            ><mtext mathvariant="monospace">번호</mtext></mrow
                          ><mo>≤</mo><mn>100</mn><mtext> </mtext
                          ><mn>000</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le \texttt{업무 번호} \le 100\,000</annotation
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
                        style="height: 0.7719em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord text"
                        ><span class="mord texttt hangul_fallback">업무</span
                        ><span class="mord texttt">&nbsp;</span
                        ><span class="mord texttt hangul_fallback"
                          >번호</span
                        ></span
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
            <p>완료된 업무들의 번호 합을 정수로 출력한다.</p>
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
1 1 1
1
2
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
0
</pre
            >
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
1 3 2
9 3 7
5 11 2
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
5
</pre
            >
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
