.class public final Lw/w;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lw/C;


# direct methods
.method public synthetic constructor <init>(Lw/C;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw/w;->q:I

    iput-object p1, p0, Lw/w;->r:Lw/C;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lw/w;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw/w;->r:Lw/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Lw/C;->H0()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    xor-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object v0, p0, Lw/w;->r:Lw/C;

    .line 20
    .line 21
    iget-object v0, v0, Lw/C;->K:LO5/e;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v1, Lw/o;->a:Lw/o;

    .line 26
    .line 27
    invoke-interface {v0, v1}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
