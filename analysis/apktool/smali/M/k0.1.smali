.class public final LM/k0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:J

.field public final synthetic r:Ll0/g;

.field public final synthetic s:LP/S0;

.field public final synthetic t:LP/S0;

.field public final synthetic u:LP/S0;

.field public final synthetic v:LP/S0;

.field public final synthetic w:F

.field public final synthetic x:J


# direct methods
.method public constructor <init>(JLl0/g;Lu/E;Lu/E;Lu/E;Lu/E;FJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LM/k0;->q:J

    .line 2
    .line 3
    iput-object p3, p0, LM/k0;->r:Ll0/g;

    .line 4
    .line 5
    iput-object p4, p0, LM/k0;->s:LP/S0;

    .line 6
    .line 7
    iput-object p5, p0, LM/k0;->t:LP/S0;

    .line 8
    .line 9
    iput-object p6, p0, LM/k0;->u:LP/S0;

    .line 10
    .line 11
    iput-object p7, p0, LM/k0;->v:LP/S0;

    .line 12
    .line 13
    iput p8, p0, LM/k0;->w:F

    .line 14
    .line 15
    iput-wide p9, p0, LM/k0;->x:J

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ll0/d;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/high16 v2, 0x43b40000    # 360.0f

    .line 6
    .line 7
    iget-wide v3, p0, LM/k0;->q:J

    .line 8
    .line 9
    iget-object v5, p0, LM/k0;->r:Ll0/g;

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, LM/q0;->d(Ll0/d;FFJLl0/g;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LM/k0;->s:LP/S0;

    .line 15
    .line 16
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/high16 v1, 0x43580000    # 216.0f

    .line 27
    .line 28
    mul-float/2addr p1, v1

    .line 29
    const/high16 v1, 0x43b40000    # 360.0f

    .line 30
    .line 31
    rem-float/2addr p1, v1

    .line 32
    iget-object v1, p0, LM/k0;->t:LP/S0;

    .line 33
    .line 34
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v2, p0, LM/k0;->u:LP/S0;

    .line 45
    .line 46
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    sub-float/2addr v1, v3

    .line 57
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/high16 v3, -0x3d4c0000    # -90.0f

    .line 62
    .line 63
    add-float/2addr p1, v3

    .line 64
    iget-object v3, p0, LM/k0;->v:LP/S0;

    .line 65
    .line 66
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    add-float/2addr v3, p1

    .line 77
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    add-float/2addr p1, v3

    .line 88
    iget v2, v5, Ll0/g;->d:I

    .line 89
    .line 90
    if-nez v2, :cond_0

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    sget v2, LM/q0;->e:F

    .line 95
    .line 96
    const/4 v3, 0x2

    .line 97
    int-to-float v3, v3

    .line 98
    div-float/2addr v2, v3

    .line 99
    iget v3, p0, LM/k0;->w:F

    .line 100
    .line 101
    div-float/2addr v3, v2

    .line 102
    const v2, 0x42652ee1

    .line 103
    .line 104
    .line 105
    mul-float/2addr v3, v2

    .line 106
    const/high16 v2, 0x40000000    # 2.0f

    .line 107
    .line 108
    div-float v2, v3, v2

    .line 109
    .line 110
    :goto_0
    add-float/2addr p1, v2

    .line 111
    const v2, 0x3dcccccd    # 0.1f

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iget-wide v3, p0, LM/k0;->x:J

    .line 119
    .line 120
    move v1, p1

    .line 121
    invoke-static/range {v0 .. v5}, LM/q0;->d(Ll0/d;FFJLl0/g;)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 125
    .line 126
    return-object p1
.end method
