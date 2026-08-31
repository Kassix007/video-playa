.class public final Lt/B;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lt/C;


# direct methods
.method public synthetic constructor <init>(Lt/C;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt/B;->q:I

    iput-object p1, p0, Lt/B;->r:Lt/C;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lt/B;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lu/q0;

    .line 7
    .line 8
    sget-object v0, Lt/t;->q:Lt/t;

    .line 9
    .line 10
    sget-object v1, Lt/t;->r:Lt/t;

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Lu/q0;->b(Lt/t;Lt/t;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lt/z;->c:Lu/f0;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Lt/t;->s:Lt/t;

    .line 22
    .line 23
    invoke-interface {p1, v1, v0}, Lu/q0;->b(Lt/t;Lt/t;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lt/B;->r:Lt/C;

    .line 30
    .line 31
    iget-object p1, p1, Lt/C;->F:Lt/E;

    .line 32
    .line 33
    iget-object p1, p1, Lt/E;->a:Lt/L;

    .line 34
    .line 35
    sget-object p1, Lt/z;->c:Lu/f0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    sget-object p1, Lt/z;->c:Lu/f0;

    .line 39
    .line 40
    :goto_0
    return-object p1

    .line 41
    :pswitch_0
    check-cast p1, Lu/q0;

    .line 42
    .line 43
    sget-object v0, Lt/t;->q:Lt/t;

    .line 44
    .line 45
    sget-object v1, Lt/t;->r:Lt/t;

    .line 46
    .line 47
    invoke-interface {p1, v0, v1}, Lu/q0;->b(Lt/t;Lt/t;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v2, 0x0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v0, Lt/t;->s:Lt/t;

    .line 56
    .line 57
    invoke-interface {p1, v1, v0}, Lu/q0;->b(Lt/t;Lt/t;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p0, Lt/B;->r:Lt/C;

    .line 64
    .line 65
    iget-object p1, p1, Lt/C;->F:Lt/E;

    .line 66
    .line 67
    iget-object p1, p1, Lt/E;->a:Lt/L;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    sget-object v2, Lt/z;->d:Lu/f0;

    .line 71
    .line 72
    :goto_1
    if-nez v2, :cond_4

    .line 73
    .line 74
    sget-object v2, Lt/z;->d:Lu/f0;

    .line 75
    .line 76
    :cond_4
    return-object v2

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
