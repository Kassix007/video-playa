.class public final LW1/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LC5/a;


# instance fields
.field public q:I

.field public r:Z

.field public final synthetic s:LD/u;


# direct methods
.method public constructor <init>(LD/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW1/m;->s:LD/u;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, LW1/m;->q:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, LW1/m;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iget-object v2, p0, LW1/m;->s:LD/u;

    .line 6
    .line 7
    iget-object v2, v2, LD/u;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lr/S;

    .line 10
    .line 11
    invoke-virtual {v2}, Lr/S;->f()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v0, v2, :cond_0

    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, LW1/m;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, LW1/m;->r:Z

    .line 9
    .line 10
    iget-object v1, p0, LW1/m;->s:LD/u;

    .line 11
    .line 12
    iget-object v1, v1, LD/u;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lr/S;

    .line 15
    .line 16
    iget v2, p0, LW1/m;->q:I

    .line 17
    .line 18
    add-int/2addr v2, v0

    .line 19
    iput v2, p0, LW1/m;->q:I

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lr/S;->g(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LT1/p;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final remove()V
    .locals 5

    .line 1
    iget-boolean v0, p0, LW1/m;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LW1/m;->s:LD/u;

    .line 6
    .line 7
    iget-object v0, v0, LD/u;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lr/S;

    .line 10
    .line 11
    iget v1, p0, LW1/m;->q:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lr/S;->g(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, LT1/p;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iput-object v2, v1, LT1/p;->s:LT1/r;

    .line 21
    .line 22
    iget v1, p0, LW1/m;->q:I

    .line 23
    .line 24
    iget-object v2, v0, Lr/S;->s:[Ljava/lang/Object;

    .line 25
    .line 26
    aget-object v3, v2, v1

    .line 27
    .line 28
    sget-object v4, Lr/r;->c:Ljava/lang/Object;

    .line 29
    .line 30
    if-eq v3, v4, :cond_0

    .line 31
    .line 32
    aput-object v4, v2, v1

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    iput-boolean v2, v0, Lr/S;->q:Z

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    iput v1, p0, LW1/m;->q:I

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, LW1/m;->r:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v1, "You must call next() before you can remove an element"

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method
