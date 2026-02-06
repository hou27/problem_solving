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
            <h1 id="자동차-전시장">자동차 전시장</h1>
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
        <p>56% 정답률</p>
        <div class="relative bg-transparent! dark:bg-transparent! h-12">
          <div
            class="absolute top-[0.5px] bg-stroke-light dark:bg-neutral-800 h-full w-px"
          ></div>
        </div>
        <p>총 제출 72회</p>
      </div>
    </div>
  </div>
  <article
    class="flex flex-col mdx w-full wrap-break-word text-justify *:text-label-neutral!"
  >
    <p>
      Sam은 자동차 전시장을 지을 도시를 결정하려고 합니다. 편의상 도시는 그래프
      상에서의 노드에 대응되고, 각 도시들간의 이동가능 여부는 방향성 그래프로
      나타내어집니다. 간선 하나를 지나는 데 걸리는 시간은
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
      >초이며, 그래프는
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
      >개의 노드와
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
      >개의 간선으로 이루어져 있습니다.
    </p>
    <p>
      자동차 전시장을 짓게 될 도시가 결정되면, 이 전시장에 관심이 있는
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mi>k</mi></mrow
              ><annotation encoding="application/x-tex"
                >k</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6944em"></span
            ><span class="mord mathnormal" style="margin-right: 0.03148em"
              >k</span
            ></span
          ></span
        ></span
      >명의 사람이 서로 다른 도시에서 출발하여 최단경로로 이동하여 전시장에
      도달하게 됩니다. 이때 전시장에 도달하기까지 가장 오래 걸리는 사람의 시간이
      최소가 되도록 전시장의 위치를 결정하는 프로그램을 작성해보세요.
    </p>
    <p>
      예를 들어 아래와 같이 그래프가 주어진 경우에 대해서 생각해보겠습니다. 이
      전시장에 관심이 있는 사람은 처음
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
      >,
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
      >,
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>5</mn></mrow
              ><annotation encoding="application/x-tex"
                >5</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">5</span></span
          ></span
        ></span
      >번 노드에 서있습니다.
    </p>
    <p align="center">
      <img
        class="cursor-pointer"
        type="button"
        aria-haspopup="dialog"
        aria-expanded="false"
        aria-controls="radix-_r_6p_"
        data-state="closed"
        data-slot="dialog-trigger"
        width="400"
        src="https://contents.codetree.ai/problems/3595/images/ff255ff6-9893-49a3-94df-51b978c917e8.png"
      />
    </p>
    <p>
      만약 전시장을
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
      >번 노드에 설치하게 된다면, 전시장에 도달하는데 가장 오래 걸리는 사람인
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>5</mn></mrow
              ><annotation encoding="application/x-tex"
                >5</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">5</span></span
          ></span
        ></span
      >번은
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow
                ><mn>5</mn><mo>→</mo><mn>1</mn><mo>→</mo><mn>4</mn><mo>→</mo
                ><mn>6</mn><mo>→</mo><mn>7</mn><mo>→</mo><mn>3</mn></mrow
              ><annotation encoding="application/x-tex"
                >5 \to 1 \to 4 \to 6 \to 7 \to 3</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">5</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">1</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">4</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">6</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">7</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">3</span></span
          ></span
        ></span
      >
      순서로 이동하게 되어
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>5</mn></mrow
              ><annotation encoding="application/x-tex"
                >5</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">5</span></span
          ></span
        ></span
      >초의 시간이 소요됩니다. 하지만 만약 전시장을
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>7</mn></mrow
              ><annotation encoding="application/x-tex"
                >7</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">7</span></span
          ></span
        ></span
      >번 노드에 설치하게 된다면, 전시장에 도달하는데 가장 오래 걸리는 사람인
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>5</mn></mrow
              ><annotation encoding="application/x-tex"
                >5</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">5</span></span
          ></span
        ></span
      >번은
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow
                ><mn>5</mn><mo>→</mo><mn>1</mn><mo>→</mo><mn>4</mn><mo>→</mo
                ><mn>6</mn><mo>→</mo><mn>7</mn></mrow
              ><annotation encoding="application/x-tex"
                >5 \to 1 \to 4 \to 6 \to 7</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">5</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">1</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">4</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">6</span
            ><span class="mspace" style="margin-right: 0.2778em"></span
            ><span class="mrel">→</span
            ><span class="mspace" style="margin-right: 0.2778em"></span></span
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">7</span></span
          ></span
        ></span
      >
      순서로 이동하게 되어
      <span class="katex"
        ><span class="katex-mathml"
          ><math xmlns="http://www.w3.org/1998/Math/MathML"
            ><semantics
              ><mrow><mn>4</mn></mrow
              ><annotation encoding="application/x-tex"
                >4</annotation
              ></semantics
            ></math
          ></span
        ><span class="katex-html" aria-hidden="true"
          ><span class="base"
            ><span class="strut" style="height: 0.6444em"></span
            ><span class="mord">4</span></span
          ></span
        ></span
      >초의 시간이 소요되어 걸리는 시간을 최소로 만들 수 있게 됩니다.
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
              첫 번째 줄에는 그래프의 노드 수를 나타내는 정수
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
              >과 간선의 수를 나타내는 정수
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
              >, 그리고 전시장에 관심이 있는 사람의 수를 나타내는 정수
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>k</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >k</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6944em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.03148em"
                      >k</span
                    ></span
                  ></span
                ></span
              >가 공백을 사이에 두고 주어집니다.
            </p>
            <p>
              두 번째 줄부터는
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
              >개의 줄에 걸쳐 각 간선에 해당하는 정보 정수
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow
                        ><mo stretchy="false">(</mo><mi>x</mi
                        ><mo separator="true">,</mo><mi>y</mi
                        ><mo stretchy="false">)</mo></mrow
                      ><annotation encoding="application/x-tex"
                        >(x, y)</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 1em; vertical-align: -0.25em"
                    ></span
                    ><span class="mopen">(</span
                    ><span class="mord mathnormal">x</span
                    ><span class="mpunct">,</span
                    ><span class="mspace" style="margin-right: 0.1667em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.03588em"
                      >y</span
                    ><span class="mclose">)</span></span
                  ></span
                ></span
              >가 공백을 사이에 두고 한 줄에 하나씩 주어집니다. 이는 노드
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>x</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >x</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.4306em"></span
                    ><span class="mord mathnormal">x</span></span
                  ></span
                ></span
              >에서 노드
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>y</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >y</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 0.625em; vertical-align: -0.1944em"
                    ></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.03588em"
                      >y</span
                    ></span
                  ></span
                ></span
              >로 가는 간선이 존재함을 의미합니다.
            </p>
            <p>
              그 다음 줄에는 전시장에 관심이 있는
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>k</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >k</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6944em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.03148em"
                      >k</span
                    ></span
                  ></span
                ></span
              >명의 사람이 현재 서있는 노드의 번호가 공백을 사이에 두고
              주어집니다. 처음
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mi>k</mi></mrow
                      ><annotation encoding="application/x-tex"
                        >k</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span class="strut" style="height: 0.6944em"></span
                    ><span
                      class="mord mathnormal"
                      style="margin-right: 0.03148em"
                      >k</span
                    ></span
                  ></span
                ></span
              >명의 사람은 서로 다른 노드 위에 있음을 가정해도 좋습니다.
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
                          ><mn>2</mn><mo>≤</mo><mi>n</mi
                          ><mo separator="true">,</mo><mi>m</mi><mo>≤</mo
                          ><mn>100</mn><mtext> </mtext><mn>000</mn></mrow
                        ><annotation encoding="application/x-tex"
                          >2 \le n, m \le 100\,000</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7804em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord">2</span
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
                      ><span class="mord mathnormal">n</span
                      ><span class="mpunct">,</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
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
                        ><mrow><mn>2</mn><mo>≤</mo><mi>k</mi><mo>≤</mo></mrow
                        ><annotation encoding="application/x-tex"
                          >2 \le k \le</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 0.7804em; vertical-align: -0.136em"
                      ></span
                      ><span class="mord">2</span
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
                        style="height: 0.8304em; vertical-align: -0.136em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.03148em"
                        >k</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.2778em"
                      ></span
                      ><span class="mrel">≤</span></span
                    ></span
                  ></span
                >
                min<span class="katex"
                  ><span class="katex-mathml"
                    ><math xmlns="http://www.w3.org/1998/Math/MathML"
                      ><semantics
                        ><mrow
                          ><mo stretchy="false">(</mo><mi>n</mi
                          ><mo separator="true">,</mo><mn>10</mn
                          ><mo stretchy="false">)</mo></mrow
                        ><annotation encoding="application/x-tex"
                          >(n, 10)</annotation
                        ></semantics
                      ></math
                    ></span
                  ><span class="katex-html" aria-hidden="true"
                    ><span class="base"
                      ><span
                        class="strut"
                        style="height: 1em; vertical-align: -0.25em"
                      ></span
                      ><span class="mopen">(</span
                      ><span class="mord mathnormal">n</span
                      ><span class="mpunct">,</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
                      ></span
                      ><span class="mord">10</span
                      ><span class="mclose">)</span></span
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
                          ><mn>1</mn><mo>≤</mo><mi>x</mi
                          ><mo separator="true">,</mo><mi>y</mi><mo>≤</mo
                          ><mi>n</mi></mrow
                        ><annotation encoding="application/x-tex"
                          >1 \le x, y \le n</annotation
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
                      ><span class="mord mathnormal">x</span
                      ><span class="mpunct">,</span
                      ><span
                        class="mspace"
                        style="margin-right: 0.1667em"
                      ></span
                      ><span
                        class="mord mathnormal"
                        style="margin-right: 0.03588em"
                        >y</span
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
                >
              </li>
              <li>
                모든 사람이 도달 가능한 노드에 전시장을 설치해야만 함에
                유의합니다.
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
              전시장의 위치를 적절하게 선택하여 가장 오래 걸리는 사람의 시간이
              최소가 되었을 때, 해당 사람이 전시장에 도달하는 데 걸리는 시간을
              출력합니다. 처음 사람이 서있던 노드 위에 전시장을 설치하는 것도
              가능하며, 모든 사람이 도달 가능한 노드에 전시장을 설치해야만 함에
              유의합니다. 만약 그러한 노드가 없다면
              <span class="katex"
                ><span class="katex-mathml"
                  ><math xmlns="http://www.w3.org/1998/Math/MathML"
                    ><semantics
                      ><mrow><mo>−</mo><mn>1</mn></mrow
                      ><annotation encoding="application/x-tex"
                        >-1</annotation
                      ></semantics
                    ></math
                  ></span
                ><span class="katex-html" aria-hidden="true"
                  ><span class="base"
                    ><span
                      class="strut"
                      style="height: 0.7278em; vertical-align: -0.0833em"
                    ></span
                    ><span class="mord">−</span
                    ><span class="mord">1</span></span
                  ></span
                ></span
              >을 출력합니다.
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
7 8 3
1 4
4 5
5 1
4 1
4 6
6 7
2 7
7 3
1 2 5
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
7 9 3
1 4
4 5
5 1
4 1
4 6
6 7
2 7
7 3
3 4
1 2 5
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
3
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
