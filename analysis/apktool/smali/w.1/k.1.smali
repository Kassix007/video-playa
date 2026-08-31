.class public final Lw/k;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lkotlin/jvm/internal/v;

.field public r:Lu/l;

.field public s:I

.field public final synthetic t:F

.field public final synthetic u:Lw/l;

.field public final synthetic v:Lw/C0;


# direct methods
.method public constructor <init>(FLw/l;Lw/C0;Lq5/c;)V
    .locals 0

    .line 1
    iput p1, p0, Lw/k;->t:F

    .line 2
    .line 3
    iput-object p2, p0, Lw/k;->u:Lw/l;

    .line 4
    .line 5
    iput-object p3, p0, Lw/k;->v:Lw/C0;

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
    new-instance p1, Lw/k;

    .line 2
    .line 3
    iget-object v0, p0, Lw/k;->u:Lw/l;

    .line 4
    .line 5
    iget-object v1, p0, Lw/k;->v:Lw/C0;

    .line 6
    .line 7
    iget v2, p0, Lw/k;->t:F

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lw/k;-><init>(FLw/l;Lw/C0;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Lw/k;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/k;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lw/k;->s:I

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
    iget-object v0, p0, Lw/k;->r:Lu/l;

    .line 9
    .line 10
    iget-object v1, p0, Lw/k;->q:Lkotlin/jvm/internal/v;

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget p1, p0, Lw/k;->t:F

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/high16 v2, 0x3f800000    # 1.0f

    .line 34
    .line 35
    cmpl-float v0, v0, v2

    .line 36
    .line 37
    if-lez v0, :cond_3

    .line 38
    .line 39
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput p1, v0, Lkotlin/jvm/internal/v;->q:F

    .line 45
    .line 46
    new-instance v2, Lkotlin/jvm/internal/v;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/16 v4, 0x1c

    .line 53
    .line 54
    invoke-static {v3, p1, v4}, Lu/d;->a(FFI)Lu/l;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :try_start_1
    iget-object v3, p0, Lw/k;->u:Lw/l;

    .line 59
    .line 60
    iget-object v4, v3, Lw/l;->a:Lu/v;

    .line 61
    .line 62
    new-instance v5, LA/J;

    .line 63
    .line 64
    iget-object v6, p0, Lw/k;->v:Lw/C0;

    .line 65
    .line 66
    invoke-direct {v5, v2, v6, v0, v3}, LA/J;-><init>(Lkotlin/jvm/internal/v;Lw/C0;Lkotlin/jvm/internal/v;Lw/l;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Lw/k;->q:Lkotlin/jvm/internal/v;

    .line 70
    .line 71
    iput-object p1, p0, Lw/k;->r:Lu/l;

    .line 72
    .line 73
    iput v1, p0, Lw/k;->s:I

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-static {p1, v4, v1, v5, p0}, Lu/d;->e(Lu/l;Lu/v;ZLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 81
    .line 82
    if-ne p1, v1, :cond_2

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_2
    move-object v1, v0

    .line 86
    goto :goto_0

    .line 87
    :catch_0
    move-object v1, v0

    .line 88
    move-object v0, p1

    .line 89
    :catch_1
    invoke-virtual {v0}, Lu/l;->b()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput p1, v1, Lkotlin/jvm/internal/v;->q:F

    .line 100
    .line 101
    :goto_0
    iget p1, v1, Lkotlin/jvm/internal/v;->q:F

    .line 102
    .line 103
    :cond_3
    new-instance v0, Ljava/lang/Float;

    .line 104
    .line 105
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 106
    .line 107
    .line 108
    return-object v0
.end method
