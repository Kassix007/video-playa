.class public final LC0/v;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lkotlin/jvm/internal/y;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/y;I)V
    .locals 0

    .line 1
    iput p2, p0, LC0/v;->q:I

    iput-object p1, p0, LC0/v;->r:Lkotlin/jvm/internal/y;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LC0/v;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LB0/E0;

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lc0/l;

    .line 10
    .line 11
    iget-object v0, v0, Lc0/l;->q:Lc0/l;

    .line 12
    .line 13
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LC0/v;->r:Lkotlin/jvm/internal/y;

    .line 18
    .line 19
    iput-object p1, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x1

    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    check-cast p1, LB0/E0;

    .line 30
    .line 31
    const-string v0, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, LE/g0;

    .line 37
    .line 38
    iget-object p1, p1, LE/g0;->E:LE/K;

    .line 39
    .line 40
    iget-object v0, p0, LC0/v;->r:Lkotlin/jvm/internal/y;

    .line 41
    .line 42
    iget-object v1, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ljava/util/List;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    filled-new-array {p1}, [LE/K;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/n2;->C([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_1
    iput-object v1, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 61
    .line 62
    sget-object p1, LB0/D0;->r:LB0/D0;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_1
    check-cast p1, Lh0/o;

    .line 66
    .line 67
    iget-object v0, p0, LC0/v;->r:Lkotlin/jvm/internal/y;

    .line 68
    .line 69
    iput-object p1, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 70
    .line 71
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
