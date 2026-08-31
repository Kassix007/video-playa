.class public final LM/Z;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:F

.field public final synthetic r:J

.field public final synthetic s:LM/I0;


# direct methods
.method public constructor <init>(FJLM/I0;)V
    .locals 0

    .line 1
    iput p1, p0, LM/Z;->q:F

    .line 2
    .line 3
    iput-wide p2, p0, LM/Z;->r:J

    .line 4
    .line 5
    iput-object p4, p0, LM/Z;->s:LM/I0;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, LN/t;

    .line 2
    .line 3
    iget v0, p0, LM/Z;->q:F

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p1, LN/t;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    iget-object p1, p1, LN/t;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    sget-object v3, LM/J0;->q:LM/J0;

    .line 14
    .line 15
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, LM/Z;->r:J

    .line 19
    .line 20
    const-wide v3, 0xffffffffL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    and-long/2addr v1, v3

    .line 26
    long-to-int v1, v1

    .line 27
    int-to-float v2, v1

    .line 28
    const/4 v3, 0x2

    .line 29
    int-to-float v3, v3

    .line 30
    div-float v3, v0, v3

    .line 31
    .line 32
    cmpl-float v3, v2, v3

    .line 33
    .line 34
    if-lez v3, :cond_0

    .line 35
    .line 36
    iget-object v3, p0, LM/Z;->s:LM/I0;

    .line 37
    .line 38
    iget-boolean v3, v3, LM/I0;->a:Z

    .line 39
    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    const/high16 v3, 0x40000000    # 2.0f

    .line 43
    .line 44
    div-float v3, v0, v3

    .line 45
    .line 46
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    sget-object v4, LM/J0;->s:LM/J0;

    .line 51
    .line 52
    invoke-interface {p1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_0
    if-eqz v1, :cond_1

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    sub-float/2addr v0, v2

    .line 59
    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, LM/J0;->r:LM/J0;

    .line 68
    .line 69
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 73
    .line 74
    return-object p1
.end method
