.class public final LB0/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB0/d;


# direct methods
.method public synthetic constructor <init>(LB0/d;I)V
    .locals 0

    .line 1
    iput p2, p0, LB0/c;->q:I

    iput-object p1, p0, LB0/c;->r:LB0/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LB0/c;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB0/c;->r:LB0/d;

    .line 7
    .line 8
    iget-object v1, v0, LB0/d;->E:Lc0/k;

    .line 9
    .line 10
    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, LA0/c;

    .line 16
    .line 17
    invoke-interface {v1, v0}, LA0/c;->e(LA0/g;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    iget-object v0, p0, LB0/c;->r:LB0/d;

    .line 24
    .line 25
    invoke-virtual {v0}, LB0/d;->A0()V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
