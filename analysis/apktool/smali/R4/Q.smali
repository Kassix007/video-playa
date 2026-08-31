.class public final synthetic LR4/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# instance fields
.field public final synthetic a:Ljava/util/Calendar;

.field public final synthetic b:LR4/U;

.field public final synthetic c:LJ5/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;LR4/U;LJ5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/Q;->a:Ljava/util/Calendar;

    iput-object p2, p0, LR4/Q;->b:LR4/U;

    iput-object p3, p0, LR4/Q;->c:LJ5/i;

    return-void
.end method


# virtual methods
.method public final onDateSet(Landroid/widget/DatePicker;III)V
    .locals 9

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v1, p0, LR4/Q;->a:Ljava/util/Calendar;

    .line 3
    .line 4
    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->set(II)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-virtual {v1, p1, p3}, Ljava/util/Calendar;->set(II)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x5

    .line 12
    invoke-virtual {v1, p1, p4}, Ljava/util/Calendar;->set(II)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0xb

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/16 p1, 0xc

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    new-instance p1, Landroid/app/TimePickerDialog;

    .line 28
    .line 29
    iget-object v0, p0, LR4/Q;->b:LR4/U;

    .line 30
    .line 31
    iget-object v8, v0, LR4/U;->a:Lcom/web2native/MainActivity;

    .line 32
    .line 33
    new-instance v0, LR4/T;

    .line 34
    .line 35
    iget-object v2, p0, LR4/Q;->c:LJ5/i;

    .line 36
    .line 37
    move v3, p2

    .line 38
    move v4, p3

    .line 39
    move v5, p4

    .line 40
    invoke-direct/range {v0 .. v5}, LR4/T;-><init>(Ljava/util/Calendar;LJ5/i;III)V

    .line 41
    .line 42
    .line 43
    move-object v3, v8

    .line 44
    const/4 v8, 0x0

    .line 45
    const v4, 0x7f12012e

    .line 46
    .line 47
    .line 48
    move-object v2, p1

    .line 49
    move-object v5, v0

    .line 50
    invoke-direct/range {v2 .. v8}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/app/TimePickerDialog;->show()V

    .line 54
    .line 55
    .line 56
    return-void
.end method
