.class public final Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:I

.field public final r:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    .line 5
    .line 6
    iput p2, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;

    .line 12
    .line 13
    iget v1, p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    .line 14
    .line 15
    iget v3, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    .line 16
    .line 17
    if-eq v3, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    .line 21
    .line 22
    iget p1, p1, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    .line 23
    .line 24
    if-eq v1, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, Le3/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    .line 7
    .line 8
    iput v1, v0, Le3/l;->E:I

    .line 9
    .line 10
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    .line 11
    .line 12
    iput v1, v0, Le3/l;->F:I

    .line 13
    .line 14
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 1

    .line 1
    check-cast p1, Le3/l;

    .line 2
    .line 3
    const-string v0, "node"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    .line 9
    .line 10
    iput v0, p1, Le3/l;->E:I

    .line 11
    .line 12
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    .line 13
    .line 14
    iput v0, p1, Le3/l;->F:I

    .line 15
    .line 16
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LottieAnimationSizeElement(width="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
