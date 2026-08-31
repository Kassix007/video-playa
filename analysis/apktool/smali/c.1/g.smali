.class public final Lc/g;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lkotlin/jvm/internal/u;

.field public r:I

.field public final synthetic s:Lc/h;

.field public final synthetic t:LB5/e;

.field public final synthetic u:Lcom/google/android/gms/internal/measurement/O1;


# direct methods
.method public constructor <init>(Lc/h;LB5/e;Lcom/google/android/gms/internal/measurement/O1;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/g;->s:Lc/h;

    .line 2
    .line 3
    iput-object p2, p0, Lc/g;->t:LB5/e;

    .line 4
    .line 5
    iput-object p3, p0, Lc/g;->u:Lcom/google/android/gms/internal/measurement/O1;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, Lc/g;

    .line 2
    .line 3
    iget-object v0, p0, Lc/g;->t:LB5/e;

    .line 4
    .line 5
    iget-object v1, p0, Lc/g;->u:Lcom/google/android/gms/internal/measurement/O1;

    .line 6
    .line 7
    iget-object v2, p0, Lc/g;->s:Lc/h;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lc/g;-><init>(Lc/h;LB5/e;Lcom/google/android/gms/internal/measurement/O1;Lq5/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lc/g;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc/g;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lc/g;->r:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lc/g;->q:Lkotlin/jvm/internal/u;

    .line 9
    .line 10
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lc/g;->s:Lc/h;

    .line 26
    .line 27
    iget-boolean p1, p1, Lb/u;->a:Z

    .line 28
    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    new-instance v0, Lkotlin/jvm/internal/u;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lc/g;->u:Lcom/google/android/gms/internal/measurement/O1;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/O1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, LO5/e;

    .line 41
    .line 42
    new-instance v2, LP5/d;

    .line 43
    .line 44
    invoke-direct {v2, p1, v1}, LP5/d;-><init>(LO5/v;Z)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lc/f;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-direct {p1, v0, v3}, Lc/f;-><init>(Lkotlin/jvm/internal/u;Lq5/c;)V

    .line 51
    .line 52
    .line 53
    new-instance v3, LP5/n;

    .line 54
    .line 55
    invoke-direct {v3, v2, p1}, LP5/n;-><init>(LP5/d;Lc/f;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lc/g;->q:Lkotlin/jvm/internal/u;

    .line 59
    .line 60
    iput v1, p0, Lc/g;->r:I

    .line 61
    .line 62
    iget-object p1, p0, Lc/g;->t:LB5/e;

    .line 63
    .line 64
    invoke-interface {p1, v3, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 69
    .line 70
    if-ne p1, v1, :cond_2

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    :goto_0
    iget-boolean p1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v0, "You must collect the progress flow"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 87
    .line 88
    return-object p1
.end method
