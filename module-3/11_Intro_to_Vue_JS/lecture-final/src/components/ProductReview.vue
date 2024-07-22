<template>
    <div class="main">

        <h2>Product Reviews For {{ name }}</h2>
        <p class="description"> {{ description }}</p>
        <div class="review" v-for="review in reviews" v-bind:key="review.id">
            <h4>{{ review.reviewer }}</h4>
            <div class="rating">
               <img src="../assets/star.png" alt="Yay, I am a star!" v-bind:title="review.rating + ' Star Review'" v-for="num in review.rating" v-bind:key="num">
            </div>
            <h3>{{ review.title }}</h3>
            <p>{{ review.review }}</p>


        </div>

    </div>
</template>

<script>
export default {
    // The data function always returns an object. Inside the obj, we place the 'component's instance variables
    data() {
        return {
            name: 'Head First Design Patterns',
            description: 'Another book that will collect dust on my bookshelf',
            reviews: [
                {
                    id: 1000,
                    reviewer: 'R Pérez',
                    title: 'Approachable pattern guide',
                    review:
                        'I love the uncomplicated, informal narrative style. I highly recommend this text for anyone trying to understand Design Patterns in a super simple way.',
                    rating: 4
                },
                {
                    id: 1001,
                    reviewer: 'Steve',
                    title: 'Meh',
                    review:
                        'If it is not a comic book I do not want to read it.',
                    rating: 2
                },
            ]
        }
    }

}
</script>

<style scoped>
.main {
  margin: 1rem 0;
}

.well-display {
  display: flex;
  justify-content: space-around;
  margin-bottom: 1rem;
}

.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
  padding: 0.25rem;
}
.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

.favorited {
  background-color: lightyellow;
}

.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

.rating img {
  height: 100%;
}

.review {
  border: 1px black solid;
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}
.review p {
  margin: 20px;
}

.review h3 {
  display: inline-block;
}

.review h4 {
  font-size: 1rem;
}
</style>