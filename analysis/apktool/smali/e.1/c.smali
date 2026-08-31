.class public final synthetic Le/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v;


# instance fields
.field public final synthetic q:Lb/j;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Le/b;

.field public final synthetic t:Lcom/google/android/gms/internal/measurement/I1;


# direct methods
.method public synthetic constructor <init>(Lb/j;Ljava/lang/String;Le/b;Lcom/google/android/gms/internal/measurement/I1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/c;->q:Lb/j;

    iput-object p2, p0, Le/c;->r:Ljava/lang/String;

    iput-object p3, p0, Le/c;->s:Le/b;

    iput-object p4, p0, Le/c;->t:Lcom/google/android/gms/internal/measurement/I1;

    return-void
.end method


# virtual methods
.method public final e(Landroidx/lifecycle/x;Landroidx/lifecycle/o;)V
    .locals 5

    .line 1
    sget-object p1, Landroidx/lifecycle/o;->ON_START:Landroidx/lifecycle/o;

    .line 2
    .line 3
    iget-object v0, p0, Le/c;->q:Lb/j;

    .line 4
    .line 5
    iget-object v1, p0, Le/c;->r:Ljava/lang/String;

    .line 6
    .line 7
    if-ne p1, p2, :cond_1

    .line 8
    .line 9
    iget-object p1, v0, Lb/j;->e:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    iget-object p2, v0, Lb/j;->g:Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v0, v0, Lb/j;->f:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    new-instance v2, Le/d;

    .line 16
    .line 17
    iget-object v3, p0, Le/c;->t:Lcom/google/android/gms/internal/measurement/I1;

    .line 18
    .line 19
    iget-object v4, p0, Le/c;->s:Le/b;

    .line 20
    .line 21
    invoke-direct {v2, v3, v4}, Le/d;-><init>(Lcom/google/android/gms/internal/measurement/I1;Le/b;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    invoke-interface {v4, p1}, Le/b;->d(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {v1, p2}, Lcom/google/android/gms/internal/measurement/K1;->r(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Le/a;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget p2, p1, Le/a;->q:I

    .line 55
    .line 56
    iget-object p1, p1, Le/a;->r:Landroid/content/Intent;

    .line 57
    .line 58
    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/measurement/I1;->A0(Landroid/content/Intent;I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {v4, p1}, Le/b;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    sget-object p1, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 67
    .line 68
    if-ne p1, p2, :cond_2

    .line 69
    .line 70
    iget-object p1, v0, Lb/j;->e:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    sget-object p1, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 77
    .line 78
    if-ne p1, p2, :cond_3

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lb/j;->e(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void
.end method
