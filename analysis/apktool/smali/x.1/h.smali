.class public final Lx/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/I;


# instance fields
.field public final a:Lv3/l;

.field public final b:Lu/v;

.field public final c:Lu/f0;

.field public final d:Lw/k0;


# direct methods
.method public constructor <init>(Lv3/l;Lu/v;Lu/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/h;->a:Lv3/l;

    .line 5
    .line 6
    iput-object p2, p0, Lx/h;->b:Lu/v;

    .line 7
    .line 8
    iput-object p3, p0, Lx/h;->c:Lu/f0;

    .line 9
    .line 10
    sget-object p1, Lw/p0;->b:Lw/k0;

    .line 11
    .line 12
    iput-object p1, p0, Lx/h;->d:Lw/k0;

    .line 13
    .line 14
    return-void
.end method

.method public static final b(Lx/h;Lw/i0;FFLx/d;Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, Lx/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lx/g;

    .line 7
    .line 8
    iget v1, v0, Lx/g;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx/g;->s:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lx/g;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lx/g;-><init>(Lx/h;Ls5/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, Lx/g;->q:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p5, Lx/g;->s:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_5

    .line 40
    .line 41
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_2
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v1, 0x0

    .line 57
    cmpg-float v0, v0, v1

    .line 58
    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    cmpg-float v0, v0, v1

    .line 67
    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    :goto_2
    const/16 p0, 0x1c

    .line 71
    .line 72
    invoke-static {p2, p3, p0}, Lu/d;->a(FFI)Lu/l;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_4
    iput v2, p5, Lx/g;->s:I

    .line 78
    .line 79
    iget-object v0, p0, Lx/h;->b:Lu/v;

    .line 80
    .line 81
    sget-object v2, Lu/A0;->a:LZ/m;

    .line 82
    .line 83
    new-instance v2, LE/c0;

    .line 84
    .line 85
    iget-object v3, v0, Lu/v;->a:Li3/a;

    .line 86
    .line 87
    invoke-direct {v2, v3}, LE/c0;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v3, Lu/m;

    .line 91
    .line 92
    invoke-direct {v3, v1}, Lu/m;-><init>(F)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lu/m;

    .line 96
    .line 97
    invoke-direct {v1, p3}, Lu/m;-><init>(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3, v1}, LE/c0;->t(Lu/q;Lu/q;)Lu/q;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lu/m;

    .line 105
    .line 106
    iget v1, v1, Lu/m;->a:F

    .line 107
    .line 108
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    cmpl-float v1, v1, v2

    .line 117
    .line 118
    if-ltz v1, :cond_5

    .line 119
    .line 120
    new-instance p0, Li1/a;

    .line 121
    .line 122
    const/16 v1, 0x10

    .line 123
    .line 124
    invoke-direct {p0, v1, v0}, Li1/a;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :goto_3
    move v0, p2

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    new-instance v0, Li3/a;

    .line 130
    .line 131
    iget-object p0, p0, Lx/h;->c:Lu/f0;

    .line 132
    .line 133
    const/16 v1, 0x11

    .line 134
    .line 135
    invoke-direct {v0, v1, p0}, Li3/a;-><init>(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    move-object p0, v0

    .line 139
    goto :goto_3

    .line 140
    :goto_4
    new-instance p2, Ljava/lang/Float;

    .line 141
    .line 142
    invoke-direct {p2, v0}, Ljava/lang/Float;-><init>(F)V

    .line 143
    .line 144
    .line 145
    move v0, p3

    .line 146
    new-instance p3, Ljava/lang/Float;

    .line 147
    .line 148
    invoke-direct {p3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 149
    .line 150
    .line 151
    invoke-interface/range {p0 .. p5}, Lx/b;->q(Lw/i0;Ljava/lang/Float;Ljava/lang/Float;LB5/c;Lx/g;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object p0, Lr5/a;->q:Lr5/a;

    .line 156
    .line 157
    if-ne v0, p0, :cond_6

    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_6
    :goto_5
    check-cast v0, Lx/a;

    .line 161
    .line 162
    iget-object p0, v0, Lx/a;->b:Lu/l;

    .line 163
    .line 164
    return-object p0
.end method


# virtual methods
.method public a(Lw/C0;FLq5/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lw/d;->v:Lw/d;

    .line 2
    .line 3
    check-cast p3, Ls5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, v0, p3}, Lx/h;->d(Lw/i0;FLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final c(Lw/i0;FLB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lx/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lx/c;

    .line 7
    .line 8
    iget v1, v0, Lx/c;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx/c;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lx/c;-><init>(Lx/h;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lx/c;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lx/c;->t:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p3, v0, Lx/c;->q:LB5/c;

    .line 35
    .line 36
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object v4, p0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Lx/e;

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    move-object v4, p0

    .line 56
    move-object v7, p1

    .line 57
    move v5, p2

    .line 58
    move-object v6, p3

    .line 59
    invoke-direct/range {v3 .. v8}, Lx/e;-><init>(Lx/h;FLB5/c;Lw/i0;Lq5/c;)V

    .line 60
    .line 61
    .line 62
    iput-object v6, v0, Lx/c;->q:LB5/c;

    .line 63
    .line 64
    iput v2, v0, Lx/c;->t:I

    .line 65
    .line 66
    iget-object p1, v4, Lx/h;->d:Lw/k0;

    .line 67
    .line 68
    invoke-static {p1, v3, v0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 73
    .line 74
    if-ne p4, p1, :cond_3

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_3
    move-object p3, v6

    .line 78
    :goto_1
    check-cast p4, Lx/a;

    .line 79
    .line 80
    new-instance p1, Ljava/lang/Float;

    .line 81
    .line 82
    const/4 p2, 0x0

    .line 83
    invoke-direct {p1, p2}, Ljava/lang/Float;-><init>(F)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p3, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-object p4
.end method

.method public final d(Lw/i0;FLB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lx/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lx/f;

    .line 7
    .line 8
    iget v1, v0, Lx/f;->s:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lx/f;->s:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lx/f;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lx/f;-><init>(Lx/h;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lx/f;->q:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lx/f;->s:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_2
    invoke-static {p4}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iput v2, v0, Lx/f;->s:I

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2, p3, v0}, Lx/h;->c(Lw/i0;FLB5/c;Ls5/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 56
    .line 57
    if-ne p4, p1, :cond_3

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    :goto_1
    check-cast p4, Lx/a;

    .line 61
    .line 62
    iget-object p1, p4, Lx/a;->a:Ljava/lang/Float;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iget-object p2, p4, Lx/a;->b:Lu/l;

    .line 69
    .line 70
    const/4 p3, 0x0

    .line 71
    cmpg-float p1, p1, p3

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-virtual {p2}, Lu/l;->b()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    :goto_2
    new-instance p1, Ljava/lang/Float;

    .line 87
    .line 88
    invoke-direct {p1, p3}, Ljava/lang/Float;-><init>(F)V

    .line 89
    .line 90
    .line 91
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lx/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lx/h;

    .line 6
    .line 7
    iget-object v0, p1, Lx/h;->c:Lu/f0;

    .line 8
    .line 9
    iget-object v1, p0, Lx/h;->c:Lu/f0;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lu/f0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lx/h;->b:Lu/v;

    .line 18
    .line 19
    iget-object v1, p0, Lx/h;->b:Lu/v;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p1, p1, Lx/h;->a:Lv3/l;

    .line 28
    .line 29
    iget-object v0, p0, Lx/h;->a:Lv3/l;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :cond_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lx/h;->c:Lu/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu/f0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lx/h;->b:Lu/v;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lx/h;->a:Lv3/l;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method
