.class public final synthetic LU4/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LR4/F1;


# direct methods
.method public synthetic constructor <init>(LR4/F1;LR4/k1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LU4/S;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/S;->s:LR4/F1;

    iput-object p2, p0, LU4/S;->r:LR4/k1;

    return-void
.end method

.method public synthetic constructor <init>(LR4/k1;LR4/F1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LU4/S;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU4/S;->r:LR4/k1;

    iput-object p2, p0, LU4/S;->s:LR4/F1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LU4/S;->q:I

    .line 2
    .line 3
    check-cast p1, Landroid/content/res/Configuration;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LU4/S;->r:LR4/k1;

    .line 9
    .line 10
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 11
    .line 12
    iget-object v0, p0, LU4/S;->s:LR4/F1;

    .line 13
    .line 14
    iget-object v0, v0, LR4/F1;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-static {p1, v0, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    iget-object p1, p0, LU4/S;->s:LR4/F1;

    .line 30
    .line 31
    iget-object p1, p1, LR4/F1;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LU4/S;->r:LR4/k1;

    .line 40
    .line 41
    iget-object v0, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    invoke-static {p1, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
