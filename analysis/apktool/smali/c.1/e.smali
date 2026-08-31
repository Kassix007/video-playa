.class public abstract Lc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP/z;

    .line 2
    .line 3
    sget-object v1, Lc/d;->q:Lc/d;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LP/z;-><init>(LB5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc/e;->a:LP/z;

    .line 9
    .line 10
    return-void
.end method

.method public static a(LP/o;)Lb/B;
    .locals 5

    .line 1
    sget-object v0, Lc/e;->a:LP/z;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lb/B;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    const v0, 0x206f5359

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, LP/o;->S(I)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:LP/T0;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    const-string v3, "<this>"

    .line 28
    .line 29
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const v3, 0x7f09020f

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    instance-of v4, v3, Lb/B;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    check-cast v3, Lb/B;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move-object v3, v1

    .line 49
    :goto_1
    if-eqz v3, :cond_1

    .line 50
    .line 51
    move-object v0, v3

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-static {v0}, Ll6/d;->q(Landroid/view/View;)Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    instance-of v3, v0, Landroid/view/View;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    check-cast v0, Landroid/view/View;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object v0, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move-object v0, v1

    .line 67
    :goto_2
    invoke-virtual {p0, v2}, LP/o;->p(Z)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const v3, 0x206f49c8

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v3}, LP/o;->S(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v2}, LP/o;->p(Z)V

    .line 78
    .line 79
    .line 80
    :goto_3
    if-nez v0, :cond_7

    .line 81
    .line 82
    const v0, 0x206f5b2c

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0}, LP/o;->S(I)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:LP/T0;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/content/Context;

    .line 95
    .line 96
    :goto_4
    instance-of v3, v0, Landroid/content/ContextWrapper;

    .line 97
    .line 98
    if-eqz v3, :cond_6

    .line 99
    .line 100
    instance-of v3, v0, Lb/B;

    .line 101
    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    move-object v1, v0

    .line 105
    goto :goto_5

    .line 106
    :cond_5
    check-cast v0, Landroid/content/ContextWrapper;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_4

    .line 113
    :cond_6
    :goto_5
    check-cast v1, Lb/B;

    .line 114
    .line 115
    invoke-virtual {p0, v2}, LP/o;->p(Z)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_7
    const v1, 0x206f4a19

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1}, LP/o;->S(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v2}, LP/o;->p(Z)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method
