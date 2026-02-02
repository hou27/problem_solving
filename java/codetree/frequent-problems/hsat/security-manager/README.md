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
            <h1 id="보안-담당자">보안 담당자</h1>
          </article>
        </div>
      </div>
      <div
        class="flex gap-12 flex-wrap gap-y-8 text-label-assistive text-body2 max-md:text-caption1"
      >
        <p>평균 154분</p>
        <div class="relative bg-transparent! dark:bg-transparent! h-12">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 h-full w-px"
          ></div>
        </div>
        <p>35% 정답률</p>
        <div class="relative bg-transparent! dark:bg-transparent! h-12">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 h-full w-px"
          ></div>
        </div>
        <p>총 제출 82회</p>
      </div>
    </div>
  </div>
  <article
    class="flex flex-col mdx w-full wrap-break-word text-justify *:text-label-neutral!"
  >
    <p>
      당신은 회사의 보안 담당자로서, 사무실 출입 기록 시스템을 관리하고
      있습니다. 이 시스템은 사무실 출입문에 설치된 CCTV를 통해 직원들의 출입을
      기록합니다. 각 기록은 다음 세 가지 문자 중 하나로 표시됩니다.
    </p>
    <ol>
      <li><code>(</code>: 직원이 사무실에 들어온 경우</li>
      <li><code>)</code>: 직원이 사무실에서 나간 경우</li>
      <li>
        <code>?</code>: 시스템 오류 또는 인식 불가로 인해 출입 여부가 불분명한
        경우
      </li>
    </ol>
    <p>
      당신의 목표는 CCTV 기록을 분석하여, 기록이 정상적으로 출입 상황을 반영하고
      있는지를 판단하는 것입니다. 기록이 정상적이라고 판단하기 위한 조건은
      다음과 같습니다.
    </p>
    <ol>
      <li>
        CCTV의 어떤 시점에서도 사무실에 들어온 직원 수가 나간 직원 수보다 많거나
        같아야 합니다.
      </li>
      <li>
        CCTV의 기록의 마지막까지 확인을 하였을 때, 사무실에 들어온 직원 수와
        나간 직원 수는 동일해야 합니다.
      </li>
    </ol>
    <p>
      <code>?</code>를 <code>(</code> 또는 <code>)</code>로 적절하게 해석했을 때
      CCTV의 기록이 정상적일 수 있는지를 확인할 수 있는 프로그램을 작성하세요.
    </p>
    <ul>
      <li>subtask1 (25점) : <code>?</code>가 주어지지 않습니다.</li>
      <li>
        subtask2 (25점) : <code>?</code>는 최대
        <span class="katex"
          ><span class="katex-mathml"
            ><math xmlns="http://www.w3.org/1998/Math/MathML"
              ><semantics
                ><mrow><mn>2</mn></mrow
                ><annotation encoding="application/x-tex"
                  >2</annotation
                ></semantics
              ></math
            ></span
          ><span class="katex-html" aria-hidden="true"
            ><span class="base"
              ><span class="strut" style="height: 0.6444em"></span
              ><span class="mord">2</span></span
            ></span
          ></span
        >개 주어집니다.
      </li>
      <li>subtask3 (50점) : 문제 조건 외에 별도의 제한이 없습니다.</li>
    </ul>
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
                      ><mrow><mi>N</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >N</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.10903em"
                      >N</span
                    ></span
                  ></span
                ></span
              >이 주어집니다.<br />
              두 번째 줄에는 길이가
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>N</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >N</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6833em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.10903em"
                      >N</span
                    ></span
                  ></span
                ></span
              >인 문자열이 주어집니다. 가장 첫 번째 기록부터 마지막 기록까지
              차례대로 주어지며, 이 문자열은 <code>(</code>, <code>)</code>,
              <code>?</code> 중 하나로 이루어져 있습니다.
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
                          ><mn>1</mn><mo>≤</mo><mi>N</mi><mo>≤</mo
                          ><mn>5000</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le N \le 5000</annotation
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
                        style="margin-right: 0.10903em"
                        >N</span
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
                      ><span class="mord">5000</span></span
                    ></span
                  ></span
                >
              </li>
              <li>
                문자열은 <code>(</code>, <code>)</code>, <code>?</code>로만
                이루어져 있습니다.
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
              첫번째 줄에 <code>?</code>를 <code>(</code> 또는 <code>)</code>로
              적절하게 해석했을 때 CCTV의 기록이 정상적이라면 <code>Yes</code>,
              <code>?</code>를 어떻게 해석하더라도 CCTV의 기록이 비정상적이라면
              <code>No</code>를 출력합니다.
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
6
(?(??)
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
Yes
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
                <p>
                  예제 1번에서, <code>?</code>를 다음과 같이 바꾼다면 정상적인
                  CCTV 기록이 됩니다.
                </p>
                <p align="center">
                  <img
                    class="cursor-pointer"
                    type="button"
                    aria-haspopup="dialog"
                    aria-expanded="false"
                    aria-controls="radix-_r_55_"
                    data-state="closed"
                    data-slot="dialog-trigger"
                    src="https://contents.codetree.ai/problems/4126/images/11a437eb-4cba-4ef4-8455-0d94b564979e.png"
                  />
                </p>
                <hr />
                <p align="center">
                  <img
                    class="cursor-pointer"
                    type="button"
                    aria-haspopup="dialog"
                    aria-expanded="false"
                    aria-controls="radix-_r_58_"
                    data-state="closed"
                    data-slot="dialog-trigger"
                    src="https://contents.codetree.ai/problems/4126/images/d71f0b7a-d6dc-42e6-927c-222df7986d83.png"
                  />
                </p>
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
6
(((())
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
No
</pre
            >
          </div>
        </div>
      </div>
      <div class="flex flex-col gap-16 p-10 rounded-6 bg-neutral-200">
        <div class="flex flex-col gap-8">
          <h3 class="text-heading4">예제 3</h3>
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
5
?????
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
No
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
