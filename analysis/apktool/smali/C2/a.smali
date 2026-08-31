.class public final synthetic LC2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LC2/b;


# direct methods
.method public synthetic constructor <init>(LC2/b;I)V
    .locals 0

    .line 1
    iput p2, p0, LC2/a;->q:I

    iput-object p1, p0, LC2/a;->r:LC2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LC2/a;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LC2/a;->r:LC2/b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LC2/b;->f:Ld6/l;

    .line 9
    .line 10
    const-string v1, "Content-Type"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v2, Ld6/p;->b:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->o(Ljava/lang/String;)Ld6/p;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    :cond_0
    return-object v1

    .line 26
    :pswitch_0
    sget-object v0, Ld6/c;->n:Ld6/c;

    .line 27
    .line 28
    iget-object v0, v1, LC2/b;->f:Ld6/l;

    .line 29
    .line 30
    invoke-static {v0}, LQ2/g;->J(Ld6/l;)Ld6/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
