.class public final synthetic LB0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LB0/C;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    iget v0, p0, LB0/C;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, [B

    .line 7
    .line 8
    check-cast p2, [B

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    array-length v1, p2

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    array-length p1, p1

    .line 15
    array-length p2, p2

    .line 16
    sub-int/2addr p1, p2

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    move v1, v0

    .line 20
    :goto_0
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_2

    .line 22
    .line 23
    aget-byte v2, p1, v1

    .line 24
    .line 25
    aget-byte v3, p2, v1

    .line 26
    .line 27
    if-eq v2, v3, :cond_1

    .line 28
    .line 29
    sub-int p1, v2, v3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move p1, v0

    .line 36
    :goto_1
    return p1

    .line 37
    :pswitch_0
    check-cast p1, LP/L;

    .line 38
    .line 39
    check-cast p2, LP/L;

    .line 40
    .line 41
    iget p1, p1, LP/L;->b:I

    .line 42
    .line 43
    iget p2, p2, LP/L;->b:I

    .line 44
    .line 45
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->f(II)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :pswitch_1
    check-cast p1, Lm5/j;

    .line 51
    .line 52
    check-cast p2, Lm5/j;

    .line 53
    .line 54
    iget-object v0, p1, Lm5/j;->r:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Number;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object p1, p1, Lm5/j;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    sub-int/2addr v0, p1

    .line 71
    iget-object p1, p2, Lm5/j;->r:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iget-object p2, p2, Lm5/j;->q:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p2, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    sub-int/2addr p1, p2

    .line 88
    sub-int/2addr v0, p1

    .line 89
    return v0

    .line 90
    :pswitch_2
    check-cast p1, LE/B;

    .line 91
    .line 92
    check-cast p2, LE/B;

    .line 93
    .line 94
    invoke-interface {p1}, LE/B;->getIndex()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-interface {p2}, LE/B;->getIndex()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->f(II)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    return p1

    .line 107
    :pswitch_3
    check-cast p1, LB0/L;

    .line 108
    .line 109
    check-cast p2, LB0/L;

    .line 110
    .line 111
    iget-object v0, p1, LB0/L;->V:LB0/P;

    .line 112
    .line 113
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 114
    .line 115
    iget v0, v0, LB0/c0;->T:F

    .line 116
    .line 117
    iget-object v1, p2, LB0/L;->V:LB0/P;

    .line 118
    .line 119
    iget-object v1, v1, LB0/P;->p:LB0/c0;

    .line 120
    .line 121
    iget v1, v1, LB0/c0;->T:F

    .line 122
    .line 123
    cmpg-float v2, v0, v1

    .line 124
    .line 125
    if-nez v2, :cond_3

    .line 126
    .line 127
    invoke-virtual {p1}, LB0/L;->t()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    invoke-virtual {p2}, LB0/L;->t()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->f(II)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    :goto_2
    return p1

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
