.class public final Ld0/b;
.super Ld0/g;
.source "SourceFile"


# instance fields
.field public final a:Lk3/d;

.field public final b:LI0/n;

.field public final c:LC0/A;

.field public final d:LJ0/a;

.field public final e:Ljava/lang/String;

.field public final f:Landroid/view/autofill/AutofillId;

.field public final g:Lr/w;

.field public h:Z


# direct methods
.method public constructor <init>(Lk3/d;LI0/n;LC0/A;LJ0/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld0/b;->a:Lk3/d;

    .line 5
    .line 6
    iput-object p2, p0, Ld0/b;->b:LI0/n;

    .line 7
    .line 8
    iput-object p3, p0, Ld0/b;->c:LC0/A;

    .line 9
    .line 10
    iput-object p4, p0, Ld0/b;->d:LJ0/a;

    .line 11
    .line 12
    iput-object p5, p0, Ld0/b;->e:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p3}, Lcom/google/firebase/c;->o(LC0/A;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/P1;->B(Landroid/view/View;)LE0/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, LE0/a;->a:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p1}, LC0/U;->h(Ljava/lang/Object;)Landroid/view/autofill/AutofillId;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    :goto_0
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iput-object p1, p0, Ld0/b;->f:Landroid/view/autofill/AutofillId;

    .line 39
    .line 40
    new-instance p1, Lr/w;

    .line 41
    .line 42
    invoke-direct {p1}, Lr/w;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Ld0/b;->g:Lr/w;

    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    const-string p1, "Required value was null."

    .line 49
    .line 50
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    throw p1
.end method
